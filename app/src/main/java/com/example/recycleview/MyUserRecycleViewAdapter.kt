package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.data.User
import kotlinx.android.synthetic.main.row.view.*

class MyUserRecycleViewAdapter(private  val mValues: List<User>):RecyclerView.Adapter<MyUserRecycleViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyUserRecycleViewAdapter.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int =mValues.size

    override fun onBindViewHolder(holder: MyUserRecycleViewAdapter.ViewHolder, position: Int) {
        val item=mValues[position]
        holder.nombre.setText(item.nombre)
        holder.email.setText(item.email)
        holder.phone.setText(item.phone)
    }
    inner class  ViewHolder(val mView:View ):RecyclerView.ViewHolder(mView){

        val nombre:TextView=mView.textView7
        val email:TextView=mView.textView8
        val phone: TextView=mView.textView9

    }
}