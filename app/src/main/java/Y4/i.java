package Y4;

import A3.InterfaceC0372f;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import c3.AbstractC0981c;
import c3.C0984f;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.C1109h;
import java.util.List;
import java.util.Map;
import r3.AbstractC6695m;
import r3.AbstractC6698p;
import r3.C6697o;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final C1105d[] f6084a = new C1105d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final C1105d f6085b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1105d f6086c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1105d f6087d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1105d f6088e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1105d f6089f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1105d f6090g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1105d f6091h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1105d f6092i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1105d f6093j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1105d f6094k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1105d f6095l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1105d f6096m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1105d f6097n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1105d f6098o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1105d f6099p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1105d f6100q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1105d f6101r;

    /* renamed from: s, reason: collision with root package name */
    public static final C1105d f6102s;

    /* renamed from: t, reason: collision with root package name */
    public static final C1105d f6103t;

    /* renamed from: u, reason: collision with root package name */
    public static final C1105d f6104u;

    /* renamed from: v, reason: collision with root package name */
    public static final C1105d f6105v;

    /* renamed from: w, reason: collision with root package name */
    private static final AbstractC6698p f6106w;

    /* renamed from: x, reason: collision with root package name */
    private static final AbstractC6698p f6107x;

    static {
        C1105d c1105d = new C1105d("vision.barcode", 1L);
        f6085b = c1105d;
        C1105d c1105d2 = new C1105d("vision.custom.ica", 1L);
        f6086c = c1105d2;
        C1105d c1105d3 = new C1105d("vision.face", 1L);
        f6087d = c1105d3;
        C1105d c1105d4 = new C1105d("vision.ica", 1L);
        f6088e = c1105d4;
        C1105d c1105d5 = new C1105d("vision.ocr", 1L);
        f6089f = c1105d5;
        f6090g = new C1105d("mlkit.ocr.chinese", 1L);
        f6091h = new C1105d("mlkit.ocr.common", 1L);
        f6092i = new C1105d("mlkit.ocr.devanagari", 1L);
        f6093j = new C1105d("mlkit.ocr.japanese", 1L);
        f6094k = new C1105d("mlkit.ocr.korean", 1L);
        C1105d c1105d6 = new C1105d("mlkit.langid", 1L);
        f6095l = c1105d6;
        C1105d c1105d7 = new C1105d("mlkit.nlclassifier", 1L);
        f6096m = c1105d7;
        C1105d c1105d8 = new C1105d("tflite_dynamite", 1L);
        f6097n = c1105d8;
        C1105d c1105d9 = new C1105d("mlkit.barcode.ui", 1L);
        f6098o = c1105d9;
        C1105d c1105d10 = new C1105d("mlkit.smartreply", 1L);
        f6099p = c1105d10;
        f6100q = new C1105d("mlkit.image.caption", 1L);
        f6101r = new C1105d("mlkit.docscan.detect", 1L);
        f6102s = new C1105d("mlkit.docscan.crop", 1L);
        f6103t = new C1105d("mlkit.docscan.enhance", 1L);
        f6104u = new C1105d("mlkit.quality.aesthetic", 1L);
        f6105v = new C1105d("mlkit.quality.technical", 1L);
        C6697o c6697o = new C6697o();
        c6697o.a("barcode", c1105d);
        c6697o.a("custom_ica", c1105d2);
        c6697o.a("face", c1105d3);
        c6697o.a("ica", c1105d4);
        c6697o.a("ocr", c1105d5);
        c6697o.a("langid", c1105d6);
        c6697o.a("nlclassifier", c1105d7);
        c6697o.a("tflite_dynamite", c1105d8);
        c6697o.a("barcode_ui", c1105d9);
        c6697o.a("smart_reply", c1105d10);
        f6106w = c6697o.b();
        C6697o c6697o2 = new C6697o();
        c6697o2.a("com.google.android.gms.vision.barcode", c1105d);
        c6697o2.a("com.google.android.gms.vision.custom.ica", c1105d2);
        c6697o2.a("com.google.android.gms.vision.face", c1105d3);
        c6697o2.a("com.google.android.gms.vision.ica", c1105d4);
        c6697o2.a("com.google.android.gms.vision.ocr", c1105d5);
        c6697o2.a("com.google.android.gms.mlkit.langid", c1105d6);
        c6697o2.a("com.google.android.gms.mlkit.nlclassifier", c1105d7);
        c6697o2.a("com.google.android.gms.tflite_dynamite", c1105d8);
        c6697o2.a("com.google.android.gms.mlkit_smartreply", c1105d10);
        f6107x = c6697o2.b();
    }

    public static void a(Context context, String str) {
        b(context, AbstractC6695m.o(str));
    }

    public static void b(Context context, List list) {
        if (C1109h.f().a(context) >= 221500000) {
            c(context, d(f6106w, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void c(Context context, final C1105d[] c1105dArr) {
        AbstractC0981c.b(context).d(C0984f.d().a(new W2.c() { // from class: Y4.t
            @Override // W2.c
            public final C1105d[] a() {
                C1105d[] c1105dArr2 = c1105dArr;
                C1105d[] c1105dArr3 = i.f6084a;
                return c1105dArr2;
            }
        }).b()).e(new InterfaceC0372f() { // from class: Y4.u
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static C1105d[] d(Map map, List list) {
        C1105d[] c1105dArr = new C1105d[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            c1105dArr[i8] = (C1105d) Z2.r.l((C1105d) map.get(list.get(i8)));
        }
        return c1105dArr;
    }
}
