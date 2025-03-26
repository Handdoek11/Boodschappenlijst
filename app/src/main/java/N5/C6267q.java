package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import com.headcode.ourgroceries.android.view.BoundedButton;
import n1.AbstractC6246a;

/* renamed from: n5.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6267q {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39720a;

    /* renamed from: b, reason: collision with root package name */
    public final BoundedButton f39721b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f39722c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f39723d;

    /* renamed from: e, reason: collision with root package name */
    public final Toolbar f39724e;

    private C6267q(LinearLayout linearLayout, BoundedButton boundedButton, LinearLayout linearLayout2, TextView textView, Toolbar toolbar) {
        this.f39720a = linearLayout;
        this.f39721b = boundedButton;
        this.f39722c = linearLayout2;
        this.f39723d = textView;
        this.f39724e = toolbar;
    }

    public static C6267q a(View view) {
        int i8 = H2.f33554Y;
        BoundedButton boundedButton = (BoundedButton) AbstractC6246a.a(view, i8);
        if (boundedButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = H2.f33581h1;
            TextView textView = (TextView) AbstractC6246a.a(view, i8);
            if (textView != null) {
                i8 = H2.f33587j1;
                Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                if (toolbar != null) {
                    return new C6267q(linearLayout, boundedButton, linearLayout, textView, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public static C6267q c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6267q d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33690T, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39720a;
    }
}
