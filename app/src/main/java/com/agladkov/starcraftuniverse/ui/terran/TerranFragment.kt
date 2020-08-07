package com.agladkov.starcraftuniverse.ui.terran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.agladkov.starcraftuniverse.R
import kotlinx.android.synthetic.main.fragment_terran.*

class TerranFragment : Fragment() {

    private lateinit var terranViewModel: TerranViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        terranViewModel =
            ViewModelProviders.of(this).get(TerranViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_terran, container, false)
        terranViewModel.text.observe(viewLifecycleOwner, Observer {
            terranTextView.text = it
        })
        return root
    }
}