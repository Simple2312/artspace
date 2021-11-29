package com.example.mypaint.menusheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cmple.artspace.R
import com.example.mypaint.customview.PaintView
import com.example.mypaint.ui.drawart
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.eraser_bottom_sheet_layout.*

class EraserBottomSheet(private val paintView: PaintView) : BottomSheetDialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.eraser_bottom_sheet_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        i_stroke_width.setOnClickListener {
            paintView.setEraser(10)
            drawart.selectedColor = "#ffffff"
            dismiss()
        }

        ii_stroke_width.setOnClickListener {
            paintView.setEraser(15)
            drawart.selectedColor = "#ffffff"
            dismiss()
        }

        iii_stroke_width.setOnClickListener {
            paintView.setEraser(35)
            drawart.selectedColor = "#ffffff"
            dismiss()
        }

        iv_stroke_width.setOnClickListener {
            paintView.setEraser(50)
            drawart.selectedColor = "#ffffff"
            dismiss()
        }
    }
}