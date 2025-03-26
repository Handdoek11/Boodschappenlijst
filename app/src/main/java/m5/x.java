package m5;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.headcode.ourgroceries.android.AbstractC5673x;
import com.headcode.ourgroceries.android.H2;
import com.headcode.ourgroceries.android.J2;
import com.headcode.ourgroceries.android.P1;

/* loaded from: classes2.dex */
public class x extends n {

    /* renamed from: e, reason: collision with root package name */
    private final Activity f39230e;

    public x(Activity activity, k kVar, ViewGroup viewGroup, p pVar) {
        super(activity, viewGroup, kVar, pVar);
        this.f39230e = activity;
    }

    private void q() {
        LayoutInflater layoutInflater = this.f39230e.getLayoutInflater();
        this.f39204b.removeAllViews();
        View inflate = layoutInflater.inflate(this.f39206d.c() ? J2.f33723z : J2.f33722y, this.f39204b, true);
        k();
        if (!this.f39206d.c()) {
            ((ViewGroup) inflate.findViewById(H2.f33562b0)).setLayoutParams(new FrameLayout.LayoutParams(-1, P1.i(o.a(d()))));
            final TextView textView = (TextView) inflate.findViewById(H2.f33538S);
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: m5.v
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    x.r(textView);
                }
            });
        }
        inflate.setOnClickListener(new View.OnClickListener() { // from class: m5.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f39229o.s(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(TextView textView) {
        if (textView.getLineCount() == 1) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.gravity = 48;
            layoutParams.weight = 2.0f;
            textView.setLayoutParams(layoutParams);
            textView.setMaxLines(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(View view) {
        AbstractC5673x.a("houseAdClick");
        P1.U(this.f39230e, "house_ad");
    }

    @Override // m5.n
    public void b() {
        this.f39204b.setVisibility(8);
        this.f39204b.removeAllViews();
    }

    @Override // m5.n
    public boolean c() {
        q();
        this.f39204b.setVisibility(0);
        super.f();
        return true;
    }
}
