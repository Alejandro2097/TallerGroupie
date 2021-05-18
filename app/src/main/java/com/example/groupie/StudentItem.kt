package com.example.groupie

import com.example.groupie.databinding.ItemStudentBinding
import com.xwray.groupie.databinding.BindableItem

class StudentItem(val name: String, val phone: String): BindableItem<ItemStudentBinding>() {
    override fun bind(viewBinding: ItemStudentBinding, position: Int) {
        viewBinding.phoneTextView.text = phone
        viewBinding.nameTextView.text = name
    }

    override fun getLayout(): Int {
        return R.layout.item_student
    }
}