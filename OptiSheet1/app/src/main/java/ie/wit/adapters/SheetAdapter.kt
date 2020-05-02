package ie.wit.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ie.wit.R
import ie.wit.models.SheetModel
import kotlinx.android.synthetic.main.card_donation.view.*

class SheetAdapter constructor(private var sheets: List<SheetModel>)
    : RecyclerView.Adapter<SheetAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            LayoutInflater.from(parent?.context).inflate(
                R.layout.card_donation,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val donation = sheets[holder.adapterPosition]
        holder.bind(donation)
    }

    override fun getItemCount(): Int = sheets.size

    class MainHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(sheet: SheetModel) {
            itemView.paymentamount.text = sheet.amount.toString()
            itemView.paymentmethod.text = sheet.paymentmethod
            itemView.imageIcon.setImageResource(R.mipmap.ic_launcher_round)
        }
    }
}