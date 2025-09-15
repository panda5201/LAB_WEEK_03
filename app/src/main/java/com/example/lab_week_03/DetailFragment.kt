package com.example.lab_week_03

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DetailFragment : Fragment() {

    private val coffeeTitle: TextView?
        get() = view?.findViewById(R.id.coffee_title)
    private val coffeeDesc: TextView?
        get() = view?.findViewById(R.id.coffee_desc)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("DetailFragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("DetailFragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("DetailFragment", "onViewCreated")

        val coffeeId = arguments?.getInt(COFFEE_ID, 0) ?: 0
        setCoffeeData(coffeeId)
    }

    fun setCoffeeData(id: Int) {
        when (id) {
            R.id.affogato -> {
                coffeeTitle?.text = getString(R.string.affogato_title)
                coffeeDesc?.text = getString(R.string.affogato_desc)
            }
            R.id.americano -> {
                coffeeTitle?.text = getString(R.string.americano_title)
                coffeeDesc?.text = getString(R.string.americano_desc)
            }
            R.id.latte -> {
                coffeeTitle?.text = getString(R.string.latte_title)
                coffeeDesc?.text = getString(R.string.latte_desc)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("DetailFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DetailFragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DetailFragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DetailFragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("DetailFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DetailFragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("DetailFragment", "onDetach")
    }

    companion object {
        const val COFFEE_ID = "coffee_id"
    }
}
