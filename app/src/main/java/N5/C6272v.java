package n5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import n1.AbstractC6246a;

/* renamed from: n5.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6272v {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39750a;

    /* renamed from: b, reason: collision with root package name */
    public final Toolbar f39751b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f39752c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f39753d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f39754e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f39755f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f39756g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f39757h;

    /* renamed from: i, reason: collision with root package name */
    public final CardView f39758i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f39759j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f39760k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f39761l;

    /* renamed from: m, reason: collision with root package name */
    public final C6273w f39762m;

    /* renamed from: n, reason: collision with root package name */
    public final C6273w f39763n;

    /* renamed from: o, reason: collision with root package name */
    public final C6273w f39764o;

    private C6272v(LinearLayout linearLayout, Toolbar toolbar, LinearLayout linearLayout2, ImageView imageView, Button button, TextView textView, TextView textView2, TextView textView3, CardView cardView, TextView textView4, TextView textView5, TextView textView6, C6273w c6273w, C6273w c6273w2, C6273w c6273w3) {
        this.f39750a = linearLayout;
        this.f39751b = toolbar;
        this.f39752c = linearLayout2;
        this.f39753d = imageView;
        this.f39754e = button;
        this.f39755f = textView;
        this.f39756g = textView2;
        this.f39757h = textView3;
        this.f39758i = cardView;
        this.f39759j = textView4;
        this.f39760k = textView5;
        this.f39761l = textView6;
        this.f39762m = c6273w;
        this.f39763n = c6273w2;
        this.f39764o = c6273w3;
    }

    public static C6272v a(View view) {
        View a8;
        int i8 = H2.f33587j1;
        Toolbar toolbar = (Toolbar) AbstractC6246a.a(view, i8);
        if (toolbar != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = H2.f33498E1;
            ImageView imageView = (ImageView) AbstractC6246a.a(view, i8);
            if (imageView != null) {
                i8 = H2.f33510I1;
                Button button = (Button) AbstractC6246a.a(view, i8);
                if (button != null) {
                    i8 = H2.f33513J1;
                    TextView textView = (TextView) AbstractC6246a.a(view, i8);
                    if (textView != null) {
                        i8 = H2.f33519L1;
                        TextView textView2 = (TextView) AbstractC6246a.a(view, i8);
                        if (textView2 != null) {
                            i8 = H2.f33522M1;
                            TextView textView3 = (TextView) AbstractC6246a.a(view, i8);
                            if (textView3 != null) {
                                i8 = H2.f33525N1;
                                CardView cardView = (CardView) AbstractC6246a.a(view, i8);
                                if (cardView != null) {
                                    i8 = H2.f33528O1;
                                    TextView textView4 = (TextView) AbstractC6246a.a(view, i8);
                                    if (textView4 != null) {
                                        i8 = H2.f33531P1;
                                        TextView textView5 = (TextView) AbstractC6246a.a(view, i8);
                                        if (textView5 != null) {
                                            i8 = H2.f33534Q1;
                                            TextView textView6 = (TextView) AbstractC6246a.a(view, i8);
                                            if (textView6 != null && (a8 = AbstractC6246a.a(view, (i8 = H2.f33540S1))) != null) {
                                                C6273w a9 = C6273w.a(a8);
                                                i8 = H2.f33543T1;
                                                View a10 = AbstractC6246a.a(view, i8);
                                                if (a10 != null) {
                                                    C6273w a11 = C6273w.a(a10);
                                                    i8 = H2.f33546U1;
                                                    View a12 = AbstractC6246a.a(view, i8);
                                                    if (a12 != null) {
                                                        return new C6272v(linearLayout, toolbar, linearLayout, imageView, button, textView, textView2, textView3, cardView, textView4, textView5, textView6, a9, a11, C6273w.a(a12));
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

    public static C6272v c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6272v d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(J2.f33696Z, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f39750a;
    }
}
