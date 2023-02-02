package com.example.dailyaffirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import model.Affirmation
import com.example.dailyaffirmations.R
/**Adapter that will populate the data of the RecyclerView*/
class ItemAdapter (private val context:Context,private val dataset: List<Affirmation>)
    :RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    /**
     * Defining a class inside another class is called creating a nested class.
     * Since ItemViewHolder is only used by ItemAdapter,
     * creating it inside ItemAdapter shows this relationship.
     * This is not mandatory, but it helps other developers understand the structure of your program.
     * The RecyclerView Only interacts with the ViewHolder and not the individual views
     * */
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        //Only the viewHolder deals with the actual views.
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    /**The onCreateViewHolder()method is called by
     * the layout manager to create new view holders for the RecyclerView
     * Remember that a view holder represents a single List Item view
     *
     * Takes 2 Parameters
     * - The viewGroup which is the RecyclerView and View Type which in this
     * case is just one available
     *
     *  */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //In the onCreateViewHolder() method, obtain an instance of LayoutInflater
        // from the provided context (context of the parent).
        // The layout inflater knows how to inflate an XML layout into
        // a hierarchy of view objects
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}