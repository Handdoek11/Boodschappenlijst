package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6261k {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39678a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f39679b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f39680c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f39681d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f39682e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f39683f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f39684g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f39685h;

    private C6261k(LinearLayout linearLayout, RecyclerView recyclerView, LinearLayout linearLayout2, Button button, ImageView imageView, Button button2, Toolbar toolbar, TextView textView) {
        this.f39678a = linearLayout;
        this.f39679b = recyclerView;
        this.f39680c = linearLayout2;
        this.f39681d = button;
        this.f39682e = imageView;
        this.f39683f = button2;
        this.f39684g = toolbar;
        this.f39685h = textView;
    }

    public static C6261k a(View view) {
        int i8 = H2.f33630y;
        RecyclerView recyclerView = (RecyclerView) AbstractC6246a.a(view, i8);
        if (recyclerView != null) {
            i8 = H2.f33499F;
            LinearLayout linearLayout = (LinearLayout) AbstractC6246a.a(view, i8);
            if (linearLayout != null) {
                i8 = H2.f33502G;
                Button button = (Button) AbstractC6246a.a(view, i8);
                if (button != null) {
                    i8 = H2.f33565c0;
                    ImageView imageView = (ImageView) AbstractC6246a.a(view, i8);
                    if (imageView != null) {
                        i8 = H2.f33584i1;
                        Button button2 = (Button) AbstractC6246a.a(view, i8);
                        if (button2 != null) {
                            i8 = H2.f33587j1;
                            Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                            if (toolbar != null) {
                                i8 = H2.f33486A1;
                                TextView textView = (TextView) AbstractC6246a.a(view, i8);
                                if (textView != null) {
                                    return new C6261k((LinearLayout) view, recyclerView, linearLayout, button, imageView, button2, toolbar, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6261k c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6261k d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33678H, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39678a;
    }
}
