package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6255e {

    /* renamed from: a, reason: collision with root package name */
    private final CoordinatorLayout f39627a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f39628b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f39629c;

    /* renamed from: d, reason: collision with root package name */
    public final Toolbar f39630d;

    /* renamed from: e, reason: collision with root package name */
    public final CoordinatorLayout f39631e;

    private C6255e(CoordinatorLayout coordinatorLayout, EditText editText, ImageButton imageButton, Toolbar toolbar, CoordinatorLayout coordinatorLayout2) {
        this.f39627a = coordinatorLayout;
        this.f39628b = editText;
        this.f39629c = imageButton;
        this.f39630d = toolbar;
        this.f39631e = coordinatorLayout2;
    }

    public static C6255e a(View view) {
        int i8 = H2.f33514K;
        EditText editText = (EditText) AbstractC6246a.a(view, i8);
        if (editText != null) {
            i8 = H2.f33517L;
            ImageButton imageButton = (ImageButton) AbstractC6246a.a(view, i8);
            if (imageButton != null) {
                i8 = H2.f33587j1;
                Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                if (toolbar != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                    return new C6255e(coordinatorLayout, editText, imageButton, toolbar, coordinatorLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6255e c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6255e d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33716s, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f39627a;
    }
}
