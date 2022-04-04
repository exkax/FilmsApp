package kg.geektech.filmsapp.ui.films;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import kg.geektech.filmsapp.data.models.Film;
import kg.geektech.filmsapp.databinding.ItemFilmBinding;
import kg.geektech.filmsapp.databinding.ItemFilmBinding;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.FilmsViewHolder> {

    private List<Film> films =  new ArrayList<>();
    private ItemClick click;
    private ImageView image;

    public FilmsAdapter(ItemClick click) {
        this.click = click;
    }
    public void setFilm(List<Film> films) {
        this.films = films;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FilmsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFilmBinding binding = ItemFilmBinding.inflate(LayoutInflater.from(parent.
               getContext()), parent, false
        );
        return new FilmsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmsViewHolder holder, int position) {
    holder.onBind(films.get(position));
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    protected class FilmsViewHolder extends  RecyclerView.ViewHolder{

        private  ItemFilmBinding binding;

        public FilmsViewHolder(ItemFilmBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Film film) {
            binding.tvTitle.setText(film.getTitle());
            binding.tvDescription.setText(film.getDescription());

            itemView.setOnClickListener(view -> {
                click.click(film);
            });

        }
    }
}
