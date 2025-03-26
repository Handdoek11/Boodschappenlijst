package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6253c {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f39613a;

    /* renamed from: b, reason: collision with root package name */
    public final Button f39614b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f39615c;

    /* renamed from: d, reason: collision with root package name */
    public final EditText f39616d;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f39617e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageButton f39618f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f39619g;

    /* renamed from: h, reason: collision with root package name */
    public final CoordinatorLayout f39620h;

    private C6253c(CoordinatorLayout coordinatorLayout, Button button, TextView textView, EditText editText, RecyclerView recyclerView, ImageButton imageButton, Toolbar toolbar, CoordinatorLayout coordinatorLayout2) {
        this.f39613a = coordinatorLayout;
        this.f39614b = button;
        this.f39615c = textView;
        this.f39616d = editText;
        this.f39617e = recyclerView;
        this.f39618f = imageButton;
        this.f39619g = toolbar;
        this.f39620h = coordinatorLayout2;
    }

    public static C6253c a(View view) {
        int i8 = H2.f33591l;
        Button button = (Button) AbstractC6246a.a(view, i8);
        if (button != null) {
            i8 = H2.f33594m;
            TextView textView = (TextView) AbstractC6246a.a(view, i8);
            if (textView != null) {
                i8 = H2.f33597n;
                EditText editText = (EditText) AbstractC6246a.a(view, i8);
                if (editText != null) {
                    i8 = H2.f33600o;
                    RecyclerView recyclerView = (RecyclerView) AbstractC6246a.a(view, i8);
                    if (recyclerView != null) {
                        i8 = H2.f33603p;
                        ImageButton imageButton = (ImageButton) AbstractC6246a.a(view, i8);
                        if (imageButton != null) {
                            i8 = H2.f33587j1;
                            Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                            if (toolbar != null) {
                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                                return new C6253c(coordinatorLayout, button, textView, editText, recyclerView, imageButton, toolbar, coordinatorLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6253c c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6253c d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33701d, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f39613a;
    }
}
