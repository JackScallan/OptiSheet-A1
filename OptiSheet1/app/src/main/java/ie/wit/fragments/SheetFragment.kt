package ie.wit.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ie.wit.R
import ie.wit.main.OptiSheetApp
import ie.wit.models.SheetModel
import kotlinx.android.synthetic.main.fragment_sheet.view.*
import org.jetbrains.anko.toast


class SheetFragment : Fragment() {

    lateinit var app: OptiSheetApp
    var totalDonated = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        app = activity?.application as OptiSheetApp
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_sheet, container, false)
        activity?.title = getString(R.string.action_sheet)





        setButtonListener(root)
        return root;
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SheetFragment().apply {
                arguments = Bundle().apply {}
            }
    }

    fun setButtonListener( layout: View) {
        layout.sheetButton.setOnClickListener {

            }
        }
    }

