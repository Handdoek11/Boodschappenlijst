package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.github.chrisbanes.photoview.PhotoView;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6263m {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39701a;

    /* renamed from: b, reason: collision with root package name */
    public final Toolbar f39702b;

    /* renamed from: c, reason: collision with root package name */
    public final PhotoView f39703c;

    private C6263m(LinearLayout linearLayout, Toolbar toolbar, PhotoView photoView) {
        this.f39701a = linearLayout;
        this.f39702b = toolbar;
        this.f39703c = photoView;
    }

    public static C6263m a(View view) {
        int i8 = H2.f33587j1;
        Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
        if (toolbar != null) {
            i8 = H2.f33596m1;
            PhotoView photoView = (PhotoView) AbstractC6246a.a(view, i8);
            if (photoView != null) {
                return new C6263m((LinearLayout) view, toolbar, photoView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6263m c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6263m d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33683M, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39701a;
    }
}
