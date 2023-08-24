package anhhv.dev.chat.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import anhhv.dev.chat.R;
import anhhv.dev.chat.model.User;

public class UserAdapter extends RecyclerView.Adapter<UserHolder> {
    private Context context;
    private List<User> users;

    public UserAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user, parent, false);
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {

        User user = users.get(position);
        holder.tvName.setText(user.firstName);
        holder.tvUsername.setText(user.username);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
