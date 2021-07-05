package com.nindikiranaf.fp_keykos.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.nindikiranaf.fp_keykos.view.penghuni_kos.HistoryPenghuniKosFragment
import com.nindikiranaf.fp_keykos.view.penghuni_kos.HomePenghuniKosFragment
import com.nindikiranaf.fp_keykos.view.penghuni_kos.ProsesFragment
import com.nindikiranaf.fp_keykos.view.penghuni_kos.SelesaiFragment

class ViewPagerAdapter(fm : FragmentManager, val fragmentCount : Int) : FragmentStatePagerAdapter(fm){
    private val fragmentTitleList = mutableListOf("Proses","Selesai")

    override fun getItem(position: Int): Fragment {
        when(position){
            0->return ProsesFragment()
            1->return SelesaiFragment()
            else->return HistoryPenghuniKosFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList[position]
    }

    override fun getCount(): Int = fragmentCount

}
