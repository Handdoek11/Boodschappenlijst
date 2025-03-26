package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6264n {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39704a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f39705b;

    private C6264n(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f39704a = linearLayout;
        this.f39705b = recyclerView;
    }

    public static C6264n a(View view) {
        int i8 = H2.f33518L0;
        RecyclerView recyclerView = (RecyclerView) AbstractC6246a.a(view, i8);
        if (recyclerView != null) {
            return new C6264n((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6264n c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6264n d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33686P, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39704a;
    }
}
