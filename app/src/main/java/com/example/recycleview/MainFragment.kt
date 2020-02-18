package com.example.recycleview


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.data.User
import kotlinx.android.synthetic.main.fragment_main.view.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {
val users= mutableListOf<User>()
    private var adapter:MyUserRecycleViewAdapter?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_main, container, false)
        users.add(User("Christopher Mitchelle","brad.gibson@example.com","011-962-7516"))
        users.add(User("brad gibson","brad.gibson@example.com","011-962-7516"))
        users.add(User("Beth Torres" ,"brad.gibson@example.com","011-962-7516"))
        users.add(User("Howard Gomez","brad.gibson@example.com","011-962-7516"))
        users.add(User("Tracey Anderson","brad.gibson@example.com","011-962-7516"))
        users.add(User("Todd Price","brad.gibson@example.com","011-962-7516"))
        users.add(User("Donald Herrera","brad.gibson@example.com","011-962-7516"))
        users.add(User("Lynn Welch","brad.gibson@example.com","011-962-7516"))
        users.add(User("Norma Campbell","brad.gibson@example.com","011-962-7516"))
        users.add(User("Teresa Smith","brad.gibson@example.com","011-962-7516"))
        users.add(User("Marian Ramos","brad.gibson@example.com","011-962-7516"))
        users.add(User("Terry Hanson","brad.gibson@example.com","011-962-7516"))
        users.add(User("Chris Fernandez","brad.gibson@example.com","011-962-7516"))
        users.add(User("Anna Stewart","brad.gibson@example.com","011-962-7516"))
        users.add(User("Lauren Garza","brad.gibson@example.com","011-962-7516"))
        users.add(User("Edna James","brad.gibson@example.com","011-962-7516"))
        users.add(User("Bradley Bishop","brad.gibson@example.com","011-962-7516"))
        users.add(User("brad gibson","brad.gibson@example.com","011-962-7516"))

        adapter=MyUserRecycleViewAdapter(users)
        view.list.layoutManager=LinearLayoutManager(context)
view.list.adapter=adapter
        return view
    }


}
