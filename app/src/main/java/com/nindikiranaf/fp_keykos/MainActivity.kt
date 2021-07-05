package com.nindikiranaf.fp_keykos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.nindikiranaf.fp_keykos.view.merchant.HomeFragment
import com.nindikiranaf.fp_keykos.view.penghuni_kos.HistoryPenghuniKosFragment
import com.nindikiranaf.fp_keykos.view.penghuni_kos.HomePenghuniKosFragment
import com.nindikiranaf.fp_keykos.view.penghuni_kos.ProfilePenghuniKosFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homePenghuniKosFragment = HomePenghuniKosFragment()
        val historyFragment = HistoryPenghuniKosFragment()
        val profilePenghuniKosFragment = ProfilePenghuniKosFragment()

        makeCurrentFragment(homePenghuniKosFragment)

        bottom_navigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_home->makeCurrentFragment(homePenghuniKosFragment)
                R.id.ic_history->makeCurrentFragment(historyFragment)
                R.id.ic_profile->makeCurrentFragment(profilePenghuniKosFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}