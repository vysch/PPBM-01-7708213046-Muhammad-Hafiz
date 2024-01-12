package com.example.login

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    var framentList : ArrayList<Fragment> = ArrayList()
    var fragmentTittle : ArrayList<String> = ArrayList()

    override fun getCount(): Int {
        return framentList.size
    }

    override fun getItem(position: Int): Fragment {
        return framentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTittle[position]
    }

    fun addFragment(fragment: Fragment,title : String){
        framentList.add(fragment)
        fragmentTittle.add(title)
    }
}