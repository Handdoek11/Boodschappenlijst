package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface PI {
    void a(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void b(View view);

    boolean c(Bundle bundle);

    boolean c0();

    void d(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener);

    void e();

    void f();

    void g(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType);

    void h();

    void i(Bundle bundle);

    void j(D2.D0 d02);

    void k(View view, Map map);

    void l(Bundle bundle);

    void m(D2.A0 a02);

    void n(View view, MotionEvent motionEvent, View view2);

    void o(View view, View view2, Map map, Map map2, boolean z7, ImageView.ScaleType scaleType, int i8);

    void p(InterfaceC1695Qh interfaceC1695Qh);

    void q();

    JSONObject r(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void r0(String str);

    void s();

    boolean t();

    JSONObject u(View view, Map map, Map map2, ImageView.ScaleType scaleType);

    void w();

    int zza();
}
