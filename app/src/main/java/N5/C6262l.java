package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6262l {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f39686a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f39687b;

    /* renamed from: c, reason: collision with root package name */
    public final FloatingActionButton f39688c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f39689d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayoutCompat f39690e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayoutCompat f39691f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f39692g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f39693h;

    /* renamed from: i, reason: collision with root package name */
    public final FloatingActionButton f39694i;

    /* renamed from: j, reason: collision with root package name */
    public final LinearLayoutCompat f39695j;

    /* renamed from: k, reason: collision with root package name */
    public final FloatingActionButton f39696k;

    /* renamed from: l, reason: collision with root package name */
    public final LinearLayoutCompat f39697l;

    /* renamed from: m, reason: collision with root package name */
    public final Toolbar f39698m;

    /* renamed from: n, reason: collision with root package name */
    public final CoordinatorLayout f39699n;

    /* renamed from: o, reason: collision with root package name */
    public final FrameLayout f39700o;

    private C6262l(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, FloatingActionButton floatingActionButton, Button button, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, TextView textView, RecyclerView recyclerView, FloatingActionButton floatingActionButton2, LinearLayoutCompat linearLayoutCompat3, FloatingActionButton floatingActionButton3, LinearLayoutCompat linearLayoutCompat4, Toolbar toolbar, CoordinatorLayout coordinatorLayout2, FrameLayout frameLayout2) {
        this.f39686a = coordinatorLayout;
        this.f39687b = frameLayout;
        this.f39688c = floatingActionButton;
        this.f39689d = button;
        this.f39690e = linearLayoutCompat;
        this.f39691f = linearLayoutCompat2;
        this.f39692g = textView;
        this.f39693h = recyclerView;
        this.f39694i = floatingActionButton2;
        this.f39695j = linearLayoutCompat3;
        this.f39696k = floatingActionButton3;
        this.f39697l = linearLayoutCompat4;
        this.f39698m = toolbar;
        this.f39699n = coordinatorLayout2;
        this.f39700o = frameLayout2;
    }

    public static C6262l a(View view) {
        int i8 = H2.f33606q;
        FrameLayout frameLayout = (FrameLayout) AbstractC6246a.a(view, i8);
        if (frameLayout != null) {
            i8 = H2.f33552X;
            FloatingActionButton floatingActionButton = (FloatingActionButton) AbstractC6246a.a(view, i8);
            if (floatingActionButton != null) {
                i8 = H2.f33506H0;
                Button button = (Button) AbstractC6246a.a(view, i8);
                if (button != null) {
                    i8 = H2.f33509I0;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) AbstractC6246a.a(view, i8);
                    if (linearLayoutCompat != null) {
                        i8 = H2.f33512J0;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) AbstractC6246a.a(view, i8);
                        if (linearLayoutCompat2 != null) {
                            i8 = H2.f33515K0;
                            TextView textView = (TextView) AbstractC6246a.a(view, i8);
                            if (textView != null) {
                                i8 = H2.f33518L0;
                                RecyclerView recyclerView = (RecyclerView) AbstractC6246a.a(view, i8);
                                if (recyclerView != null) {
                                    i8 = H2.f33566c1;
                                    FloatingActionButton floatingActionButton2 = (FloatingActionButton) AbstractC6246a.a(view, i8);
                                    if (floatingActionButton2 != null) {
                                        i8 = H2.f33569d1;
                                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) AbstractC6246a.a(view, i8);
                                        if (linearLayoutCompat3 != null) {
                                            i8 = H2.f33572e1;
                                            FloatingActionButton floatingActionButton3 = (FloatingActionButton) AbstractC6246a.a(view, i8);
                                            if (floatingActionButton3 != null) {
                                                i8 = H2.f33575f1;
                                                LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) AbstractC6246a.a(view, i8);
                                                if (linearLayoutCompat4 != null) {
                                                    i8 = H2.f33587j1;
                                                    Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                                                    if (toolbar != null) {
                                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                                                        i8 = H2.f33611r1;
                                                        FrameLayout frameLayout2 = (FrameLayout) AbstractC6246a.a(view, i8);
                                                        if (frameLayout2 != null) {
                                                            return new C6262l(coordinatorLayout, frameLayout, floatingActionButton, button, linearLayoutCompat, linearLayoutCompat2, textView, recyclerView, floatingActionButton2, linearLayoutCompat3, floatingActionButton3, linearLayoutCompat4, toolbar, coordinatorLayout, frameLayout2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6262l c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6262l d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33679I, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f39686a;
    }
}
