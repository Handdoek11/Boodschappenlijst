package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6258h {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39662a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f39663b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f39664c;

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f39665d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f39666e;

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f39667f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f39668g;

    private C6258h(LinearLayout linearLayout, TextView textView, Button button, RecyclerView recyclerView, Button button2, Toolbar toolbar, TextView textView2) {
        this.f39662a = linearLayout;
        this.f39663b = textView;
        this.f39664c = button;
        this.f39665d = recyclerView;
        this.f39666e = button2;
        this.f39667f = toolbar;
        this.f39668g = textView2;
    }

    public static C6258h a(View view) {
        int i8 = H2.f33484A;
        TextView textView = (TextView) AbstractC6246a.a(view, i8);
        if (textView != null) {
            i8 = H2.f33502G;
            Button button = (Button) AbstractC6246a.a(view, i8);
            if (button != null) {
                i8 = H2.f33634z0;
                RecyclerView recyclerView = (RecyclerView) AbstractC6246a.a(view, i8);
                if (recyclerView != null) {
                    i8 = H2.f33584i1;
                    Button button2 = (Button) AbstractC6246a.a(view, i8);
                    if (button2 != null) {
                        i8 = H2.f33587j1;
                        Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                        if (toolbar != null) {
                            i8 = H2.f33495D1;
                            TextView textView2 = (TextView) AbstractC6246a.a(view, i8);
                            if (textView2 != null) {
                                return new C6258h((LinearLayout) view, textView, button, recyclerView, button2, toolbar, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6258h c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6258h d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33674D, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39662a;
    }
}
