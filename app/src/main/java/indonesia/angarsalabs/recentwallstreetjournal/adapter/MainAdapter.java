package indonesia.angarsalabs.recentwallstreetjournal.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import indonesia.angarsalabs.recentwallstreetjournal.R;
import indonesia.angarsalabs.recentwallstreetjournal.model.Article;
import indonesia.angarsalabs.recentwallstreetjournal.view.main.MainInterface;

/**
 * Angarsa Labs...!
 * Created by Angga on 21/06/2018.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private Context context;
    private List<Article> articles;
    private MainInterface mainInterface;

    public MainAdapter(Context context, List<Article> articles, MainInterface mainInterface) {
        this.context = context;
        this.articles = articles;
        this.mainInterface = mainInterface;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_main,parent,false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        Article data = articles.get(position);

        holder.judul.setText(data.getTitle());
        holder.desc.setText(data.getDesc());
        holder.date.setText(data.getDate());
        holder.author.setText(data.getAuthor());
        holder.url = data.getUrl();
        holder.mainInterface = mainInterface;
        Picasso.get().load(data.getImage()).into(holder.cover);
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }


    public class MainViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView cover;
        TextView judul, desc, date, author;
        String url;
        FrameLayout frameLayout;
        MainInterface mainInterface;
        public MainViewHolder(View itemView) {
            super(itemView);
            cover = itemView.findViewById(R.id.rviv_main_cover);
            judul = itemView.findViewById(R.id.rvtv_main_title);
            desc = itemView.findViewById(R.id.rvtv_main_desc);
            date = itemView.findViewById(R.id.rvtv_main_date);
            author = itemView.findViewById(R.id.rvtv_main_author);
            frameLayout = itemView.findViewById(R.id.rvfl_main);

            frameLayout.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mainInterface.showArticle(url);
        }
    }
}
