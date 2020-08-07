package com.agladkov.starcraftuniverse.ui.protoss

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.agladkov.starcraftuniverse.R
import kotlinx.android.synthetic.main.fragment_protoss.*

class ProtossFragment : Fragment() {

    private lateinit var protossViewModel: ProtossViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        protossViewModel =
            ViewModelProviders.of(this).get(ProtossViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_protoss, container, false)
        protossViewModel.text.observe(viewLifecycleOwner, Observer {
            protossTextView.text = it
        })
        return root
    }
}