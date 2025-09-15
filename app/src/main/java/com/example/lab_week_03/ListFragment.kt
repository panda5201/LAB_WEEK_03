package com.example.lab_week_03

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListFragment : Fragment(), View.OnClickListener {

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
            view.findViewById(R.id.latte),
            view.findViewById(R.id.cappuccino),
            view.findViewById(R.id.mocha)
        )

        coffeeList.forEach {
            it.setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {
        v?.let { coffee ->
            val detailFragment = DetailFragment()
            val bundle = Bundle()
            bundle.putInt(DetailFragment.COFFEE_ID, coffee.id)
            detailFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, detailFragment)
                .addToBackStack(null)
                .commit()
        }
    }
}
