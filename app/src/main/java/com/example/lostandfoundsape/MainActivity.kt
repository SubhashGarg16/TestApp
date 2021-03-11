package com.example.lostandfoundsape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.lostandfoundsape.Adapters.ViewPageAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null
    var viewPagerAdapter: ViewPageAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.v_pager);
        tabLayout = findViewById(R.id.tab_layout);

        viewPagerAdapter = ViewPageAdapter(
            getSupportFragmentManager());
        viewPager!!.setAdapter(viewPagerAdapter);

        // It is used to join TabLayout with ViewPager.
        tabLayout!!.setupWithViewPager(viewPager);
    }
}