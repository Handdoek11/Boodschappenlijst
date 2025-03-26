package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import z0.X;

/* loaded from: classes.dex */
public class m extends RecyclerView.F {

    /* renamed from: u, reason: collision with root package name */
    private final Drawable f10543u;

    /* renamed from: v, reason: collision with root package name */
    private ColorStateList f10544v;

    /* renamed from: w, reason: collision with root package name */
    private final SparseArray f10545w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f10546x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10547y;

    m(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f10545w = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i8 = p.f10561a;
        sparseArray.put(i8, view.findViewById(i8));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f10543u = view.getBackground();
        if (textView != null) {
            this.f10544v = textView.getTextColors();
        }
    }

    public View g0(int i8) {
        View view = (View) this.f10545w.get(i8);
        if (view != null) {
            return view;
        }
        View findViewById = this.f10944a.findViewById(i8);
        if (findViewById != null) {
            this.f10545w.put(i8, findViewById);
        }
        return findViewById;
    }

    public boolean h0() {
        return this.f10546x;
    }

    public boolean i0() {
        return this.f10547y;
    }

    void j0() {
        Drawable background = this.f10944a.getBackground();
        Drawable drawable = this.f10543u;
        if (background != drawable) {
            X.r0(this.f10944a, drawable);
        }
        TextView textView = (TextView) g0(R.id.title);
        if (textView == null || this.f10544v == null || textView.getTextColors().equals(this.f10544v)) {
            return;
        }
        textView.setTextColor(this.f10544v);
    }

    public void k0(boolean z7) {
        this.f10546x = z7;
    }

    public void l0(boolean z7) {
        this.f10547y = z7;
    }
}
