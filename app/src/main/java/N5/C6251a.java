package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6251a {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39593a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f39594b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f39595c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f39596d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f39597e;

    /* renamed from: f, reason: collision with root package name */
    public final Button f39598f;

    /* renamed from: g, reason: collision with root package name */
    public final Button f39599g;

    /* renamed from: h, reason: collision with root package name */
    public final Button f39600h;

    /* renamed from: i, reason: collision with root package name */
    public final Button f39601i;

    /* renamed from: j, reason: collision with root package name */
    public final Button f39602j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f39603k;

    /* renamed from: l, reason: collision with root package name */
    public final Toolbar f39604l;

    /* renamed from: m, reason: collision with root package name */
    public final LinearLayout f39605m;

    private C6251a(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, ImageView imageView, Button button, Button button2, Button button3, Button button4, Button button5, TextView textView4, Toolbar toolbar, LinearLayout linearLayout2) {
        this.f39593a = linearLayout;
        this.f39594b = textView;
        this.f39595c = textView2;
        this.f39596d = textView3;
        this.f39597e = imageView;
        this.f39598f = button;
        this.f39599g = button2;
        this.f39600h = button3;
        this.f39601i = button4;
        this.f39602j = button5;
        this.f39603k = textView4;
        this.f39604l = toolbar;
        this.f39605m = linearLayout2;
    }

    public static C6251a a(View view) {
        int i8 = H2.f33558a;
        TextView textView = (TextView) AbstractC6246a.a(view, i8);
        if (textView != null) {
            i8 = H2.f33561b;
            TextView textView2 = (TextView) AbstractC6246a.a(view, i8);
            if (textView2 != null) {
                i8 = H2.f33564c;
                TextView textView3 = (TextView) AbstractC6246a.a(view, i8);
                if (textView3 != null) {
                    i8 = H2.f33567d;
                    ImageView imageView = (ImageView) AbstractC6246a.a(view, i8);
                    if (imageView != null) {
                        i8 = H2.f33570e;
                        Button button = (Button) AbstractC6246a.a(view, i8);
                        if (button != null) {
                            i8 = H2.f33573f;
                            Button button2 = (Button) AbstractC6246a.a(view, i8);
                            if (button2 != null) {
                                i8 = H2.f33576g;
                                Button button3 = (Button) AbstractC6246a.a(view, i8);
                                if (button3 != null) {
                                    i8 = H2.f33579h;
                                    Button button4 = (Button) AbstractC6246a.a(view, i8);
                                    if (button4 != null) {
                                        i8 = H2.f33582i;
                                        Button button5 = (Button) AbstractC6246a.a(view, i8);
                                        if (button5 != null) {
                                            i8 = H2.f33529P;
                                            TextView textView4 = (TextView) AbstractC6246a.a(view, i8);
                                            if (textView4 != null) {
                                                i8 = H2.f33587j1;
                                                Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
                                                if (toolbar != null) {
                                                    LinearLayout linearLayout = (LinearLayout) view;
                                                    return new C6251a(linearLayout, textView, textView2, textView3, imageView, button, button2, button3, button4, button5, textView4, toolbar, linearLayout);
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

    public static C6251a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6251a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33697a, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39593a;
    }
}
