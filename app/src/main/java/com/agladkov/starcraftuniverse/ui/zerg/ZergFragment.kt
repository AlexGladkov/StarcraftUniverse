package com.agladkov.starcraftuniverse.ui.zerg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.agladkov.starcraftuniverse.R

class ZergFragment : Fragment() {

    private lateinit var zergViewModel: ZergViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        zergViewModel =
            ViewModelProviders.of(this).get(ZergViewModel::class.java)
        return inflater.inflate(R.layout.fragment_zerg, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val zergItemsView: RecyclerView = view.findViewById(R.id.zergItemsView)
        val zergAdapter = ZergAdapter()
        zergItemsView.adapter = zergAdapter
        zergItemsView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        zergViewModel.unitData.observe(viewLifecycleOwner, Observer { zergsList ->
            zergAdapter.setData(zergsList)
        })

        zergViewModel.generateUnits()
    }
}