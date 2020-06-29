package com.example.aprendaingles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.aprendaingles.Fragments.BichosFragment
import com.example.aprendaingles.Fragments.NumerosFragment
import com.example.aprendaingles.Fragments.VogaisFragment
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewp:ViewPager
    private lateinit var viewt:SmartTabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        viewp = viewpager
        viewt=viewPagerTab

        supportActionBar?.elevation ?:0

        var adapter = FragmentPagerItemAdapter(supportFragmentManager,FragmentPagerItems.with(this)
            .add("Bichos",BichosFragment().javaClass)
            .add("Números",NumerosFragment().javaClass)
            .add("Vogais",VogaisFragment().javaClass)
            .create())


        viewp.adapter = adapter

        viewt.setViewPager(viewp)




    }

}