package com.binh.chatapp
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {

    private lateinit var ivAvatar: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvTime: TextView

    private var user: User? = null

    init {
        ivAvatar = itemView.findViewById(R.id.ivAvatar)
        tvName = itemView.findViewById(R.id.tvName)
        tvTime = itemView.findViewById(R.id.tvTime)
    }

    fun bind(user: User) {
        this.user = user

        ivAvatar.setImageResource(user.avatar)
        tvName.text = user.name
        tvTime.text = user.time
    }
}