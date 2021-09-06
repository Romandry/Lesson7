package ua.javabegin.examples.lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.Navigation

class SecondActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        navController = Navigation.findNavController(this, R.id.second_graph)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.second_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.menu_item_4 -> navController.navigate(R.id.fragment4)
            R.id.menu_item_5 -> navController.navigate(R.id.fragment3)
            R.id.menu_item_6 -> navController.navigate(R.id.thirdActivity)
            R.id.menu_item_7 -> navController.navigate(R.id.mainActivity)
        }

        return super.onOptionsItemSelected(item)
    }
}