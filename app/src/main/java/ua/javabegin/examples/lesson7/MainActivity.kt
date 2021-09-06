package ua.javabegin.examples.lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var bundle = Bundle()
        bundle.putString("param1", "Param1!")
        bundle.putString("param2", "Param2!")

        NavigationUI.onNavDestinationSelected(item, navController);
//        when(item.itemId) {
//            R.id.menu_item_1 -> navController.navigate(R.id.fragment2, bundle)
//            R.id.menu_item_2 -> navController.navigate(R.id.fragment1)
//            R.id.menu_item_3 -> navController.navigate(R.id.secondActivity)
//        }

        return super.onOptionsItemSelected(item)
    }
}