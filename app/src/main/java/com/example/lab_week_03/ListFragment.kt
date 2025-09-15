package com.example.lab_week_03

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListFragment : Fragment(), View.OnClickListener {

    private lateinit var coffeeListener: CoffeeListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("ListFragment", "onAttach")
        if (context is CoffeeListener) {
            coffeeListener = context
        } else {
            throw RuntimeException("Must implement CoffeeListener")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ListFragment", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("ListFragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ListFragment", "onViewCreated")

        val coffeeList = listOf<View>(
            view.findViewById(R.id.affogato),
            view.findViewById(R.id.americano),
            view.findViewById(R.id.latte)
        )
        coffeeList.forEach {
            it.setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {
        v?.let { coffee ->
            coffeeListener.onSelected(coffee.id)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ListFragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ListFragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ListFragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ListFragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ListFragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ListFragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("ListFragment", "onDetach")
    }
}
