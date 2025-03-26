package n5;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.headcode.ourgroceries.android.H2;
import n1.AbstractC6246a;

/* renamed from: n5.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6273w {

    /* renamed from: a, reason: collision with root package name */
    private final CardView f39765a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f39766b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f39767c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f39768d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f39769e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f39770f;

    /* renamed from: g, reason: collision with root package name */
    public final LinearLayout f39771g;

    private C6273w(CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout, LinearLayout linearLayout) {
        this.f39765a = cardView;
        this.f39766b = textView;
        this.f39767c = textView2;
        this.f39768d = textView3;
        this.f39769e = textView4;
        this.f39770f = frameLayout;
        this.f39771g = linearLayout;
    }

    public static C6273w a(View view) {
        int i8 = H2.f33605p1;
        TextView textView = (TextView) AbstractC6246a.a(view, i8);
        if (textView != null) {
            i8 = H2.f33501F1;
            TextView textView2 = (TextView) AbstractC6246a.a(view, i8);
            if (textView2 != null) {
                i8 = H2.f33504G1;
                TextView textView3 = (TextView) AbstractC6246a.a(view, i8);
                if (textView3 != null) {
                    i8 = H2.f33507H1;
                    TextView textView4 = (TextView) AbstractC6246a.a(view, i8);
                    if (textView4 != null) {
                        i8 = H2.f33516K1;
                        FrameLayout frameLayout = (FrameLayout) AbstractC6246a.a(view, i8);
                        if (frameLayout != null) {
                            i8 = H2.f33537R1;
                            LinearLayout linearLayout = (LinearLayout) AbstractC6246a.a(view, i8);
                            if (linearLayout != null) {
                                return new C6273w((CardView) view, textView, textView2, textView3, textView4, frameLayout, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    public CardView b() {
        return this.f39765a;
    }
}
