package com.nindikiranaf.fp_keykos.view.penghuni_kos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.nindikiranaf.fp_keykos.R
import com.nindikiranaf.fp_keykos.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_history.*


class HistoryPenghuniKosFragment: Fragment() {
lateinit var historyPagerAdapter: ViewPagerAdapter

private val myContext = FragmentActivity()

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureTopNavigation()
    }
private fun configureTopNavigation(){
    viewPager.adapter = ViewPagerAdapter(childFragmentManager, 2)
    viewPager.offscreenPageLimit = 2
    tabs.setupWithViewPager(viewPager)

}
}