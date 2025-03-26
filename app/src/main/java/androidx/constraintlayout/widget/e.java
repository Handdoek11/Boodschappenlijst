package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.ads.C1445Je;
import h0.C5822a;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import l0.AbstractC6165a;
import l0.AbstractC6166b;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class e {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f8462g = {0, 4, 8};

    /* renamed from: h, reason: collision with root package name */
    private static SparseIntArray f8463h = new SparseIntArray();

    /* renamed from: i, reason: collision with root package name */
    private static SparseIntArray f8464i = new SparseIntArray();

    /* renamed from: a, reason: collision with root package name */
    public String f8465a = "";

    /* renamed from: b, reason: collision with root package name */
    private String[] f8466b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public int f8467c = 0;

    /* renamed from: d, reason: collision with root package name */
    private HashMap f8468d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private boolean f8469e = true;

    /* renamed from: f, reason: collision with root package name */
    private HashMap f8470f = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f8471a;

        /* renamed from: b, reason: collision with root package name */
        String f8472b;

        /* renamed from: c, reason: collision with root package name */
        public final d f8473c = new d();

        /* renamed from: d, reason: collision with root package name */
        public final c f8474d = new c();

        /* renamed from: e, reason: collision with root package name */
        public final b f8475e = new b();

        /* renamed from: f, reason: collision with root package name */
        public final C0151e f8476f = new C0151e();

        /* renamed from: g, reason: collision with root package name */
        public HashMap f8477g = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        C0150a f8478h;

        /* renamed from: androidx.constraintlayout.widget.e$a$a, reason: collision with other inner class name */
        static class C0150a {

            /* renamed from: a, reason: collision with root package name */
            int[] f8479a = new int[10];

            /* renamed from: b, reason: collision with root package name */
            int[] f8480b = new int[10];

            /* renamed from: c, reason: collision with root package name */
            int f8481c = 0;

            /* renamed from: d, reason: collision with root package name */
            int[] f8482d = new int[10];

            /* renamed from: e, reason: collision with root package name */
            float[] f8483e = new float[10];

            /* renamed from: f, reason: collision with root package name */
            int f8484f = 0;

            /* renamed from: g, reason: collision with root package name */
            int[] f8485g = new int[5];

            /* renamed from: h, reason: collision with root package name */
            String[] f8486h = new String[5];

            /* renamed from: i, reason: collision with root package name */
            int f8487i = 0;

            /* renamed from: j, reason: collision with root package name */
            int[] f8488j = new int[4];

            /* renamed from: k, reason: collision with root package name */
            boolean[] f8489k = new boolean[4];

            /* renamed from: l, reason: collision with root package name */
            int f8490l = 0;

            C0150a() {
            }

            void a(int i8, float f8) {
                int i9 = this.f8484f;
                int[] iArr = this.f8482d;
                if (i9 >= iArr.length) {
                    this.f8482d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f8483e;
                    this.f8483e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f8482d;
                int i10 = this.f8484f;
                iArr2[i10] = i8;
                float[] fArr2 = this.f8483e;
                this.f8484f = i10 + 1;
                fArr2[i10] = f8;
            }

            void b(int i8, int i9) {
                int i10 = this.f8481c;
                int[] iArr = this.f8479a;
                if (i10 >= iArr.length) {
                    this.f8479a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f8480b;
                    this.f8480b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f8479a;
                int i11 = this.f8481c;
                iArr3[i11] = i8;
                int[] iArr4 = this.f8480b;
                this.f8481c = i11 + 1;
                iArr4[i11] = i9;
            }

            void c(int i8, String str) {
                int i9 = this.f8487i;
                int[] iArr = this.f8485g;
                if (i9 >= iArr.length) {
                    this.f8485g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f8486h;
                    this.f8486h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f8485g;
                int i10 = this.f8487i;
                iArr2[i10] = i8;
                String[] strArr2 = this.f8486h;
                this.f8487i = i10 + 1;
                strArr2[i10] = str;
            }

            void d(int i8, boolean z7) {
                int i9 = this.f8490l;
                int[] iArr = this.f8488j;
                if (i9 >= iArr.length) {
                    this.f8488j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f8489k;
                    this.f8489k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f8488j;
                int i10 = this.f8490l;
                iArr2[i10] = i8;
                boolean[] zArr2 = this.f8489k;
                this.f8490l = i10 + 1;
                zArr2[i10] = z7;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i8, ConstraintLayout.b bVar) {
            this.f8471a = i8;
            b bVar2 = this.f8475e;
            bVar2.f8536j = bVar.f8367e;
            bVar2.f8538k = bVar.f8369f;
            bVar2.f8540l = bVar.f8371g;
            bVar2.f8542m = bVar.f8373h;
            bVar2.f8544n = bVar.f8375i;
            bVar2.f8546o = bVar.f8377j;
            bVar2.f8548p = bVar.f8379k;
            bVar2.f8550q = bVar.f8381l;
            bVar2.f8552r = bVar.f8383m;
            bVar2.f8553s = bVar.f8385n;
            bVar2.f8554t = bVar.f8387o;
            bVar2.f8555u = bVar.f8395s;
            bVar2.f8556v = bVar.f8397t;
            bVar2.f8557w = bVar.f8399u;
            bVar2.f8558x = bVar.f8401v;
            bVar2.f8559y = bVar.f8339G;
            bVar2.f8560z = bVar.f8340H;
            bVar2.f8492A = bVar.f8341I;
            bVar2.f8493B = bVar.f8389p;
            bVar2.f8494C = bVar.f8391q;
            bVar2.f8495D = bVar.f8393r;
            bVar2.f8496E = bVar.f8356X;
            bVar2.f8497F = bVar.f8357Y;
            bVar2.f8498G = bVar.f8358Z;
            bVar2.f8532h = bVar.f8363c;
            bVar2.f8528f = bVar.f8359a;
            bVar2.f8530g = bVar.f8361b;
            bVar2.f8524d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f8526e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f8499H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f8500I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f8501J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f8502K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f8505N = bVar.f8336D;
            bVar2.f8513V = bVar.f8345M;
            bVar2.f8514W = bVar.f8344L;
            bVar2.f8516Y = bVar.f8347O;
            bVar2.f8515X = bVar.f8346N;
            bVar2.f8545n0 = bVar.f8360a0;
            bVar2.f8547o0 = bVar.f8362b0;
            bVar2.f8517Z = bVar.f8348P;
            bVar2.f8519a0 = bVar.f8349Q;
            bVar2.f8521b0 = bVar.f8352T;
            bVar2.f8523c0 = bVar.f8353U;
            bVar2.f8525d0 = bVar.f8350R;
            bVar2.f8527e0 = bVar.f8351S;
            bVar2.f8529f0 = bVar.f8354V;
            bVar2.f8531g0 = bVar.f8355W;
            bVar2.f8543m0 = bVar.f8364c0;
            bVar2.f8507P = bVar.f8405x;
            bVar2.f8509R = bVar.f8407z;
            bVar2.f8506O = bVar.f8403w;
            bVar2.f8508Q = bVar.f8406y;
            bVar2.f8511T = bVar.f8333A;
            bVar2.f8510S = bVar.f8334B;
            bVar2.f8512U = bVar.f8335C;
            bVar2.f8551q0 = bVar.f8366d0;
            bVar2.f8503L = bVar.getMarginEnd();
            this.f8475e.f8504M = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f8475e;
            bVar.f8367e = bVar2.f8536j;
            bVar.f8369f = bVar2.f8538k;
            bVar.f8371g = bVar2.f8540l;
            bVar.f8373h = bVar2.f8542m;
            bVar.f8375i = bVar2.f8544n;
            bVar.f8377j = bVar2.f8546o;
            bVar.f8379k = bVar2.f8548p;
            bVar.f8381l = bVar2.f8550q;
            bVar.f8383m = bVar2.f8552r;
            bVar.f8385n = bVar2.f8553s;
            bVar.f8387o = bVar2.f8554t;
            bVar.f8395s = bVar2.f8555u;
            bVar.f8397t = bVar2.f8556v;
            bVar.f8399u = bVar2.f8557w;
            bVar.f8401v = bVar2.f8558x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f8499H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f8500I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f8501J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f8502K;
            bVar.f8333A = bVar2.f8511T;
            bVar.f8334B = bVar2.f8510S;
            bVar.f8405x = bVar2.f8507P;
            bVar.f8407z = bVar2.f8509R;
            bVar.f8339G = bVar2.f8559y;
            bVar.f8340H = bVar2.f8560z;
            bVar.f8389p = bVar2.f8493B;
            bVar.f8391q = bVar2.f8494C;
            bVar.f8393r = bVar2.f8495D;
            bVar.f8341I = bVar2.f8492A;
            bVar.f8356X = bVar2.f8496E;
            bVar.f8357Y = bVar2.f8497F;
            bVar.f8345M = bVar2.f8513V;
            bVar.f8344L = bVar2.f8514W;
            bVar.f8347O = bVar2.f8516Y;
            bVar.f8346N = bVar2.f8515X;
            bVar.f8360a0 = bVar2.f8545n0;
            bVar.f8362b0 = bVar2.f8547o0;
            bVar.f8348P = bVar2.f8517Z;
            bVar.f8349Q = bVar2.f8519a0;
            bVar.f8352T = bVar2.f8521b0;
            bVar.f8353U = bVar2.f8523c0;
            bVar.f8350R = bVar2.f8525d0;
            bVar.f8351S = bVar2.f8527e0;
            bVar.f8354V = bVar2.f8529f0;
            bVar.f8355W = bVar2.f8531g0;
            bVar.f8358Z = bVar2.f8498G;
            bVar.f8363c = bVar2.f8532h;
            bVar.f8359a = bVar2.f8528f;
            bVar.f8361b = bVar2.f8530g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f8524d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f8526e;
            String str = bVar2.f8543m0;
            if (str != null) {
                bVar.f8364c0 = str;
            }
            bVar.f8366d0 = bVar2.f8551q0;
            bVar.setMarginStart(bVar2.f8504M);
            bVar.setMarginEnd(this.f8475e.f8503L);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f8475e.a(this.f8475e);
            aVar.f8474d.a(this.f8474d);
            aVar.f8473c.a(this.f8473c);
            aVar.f8476f.a(this.f8476f);
            aVar.f8471a = this.f8471a;
            aVar.f8478h = this.f8478h;
            return aVar;
        }
    }

    public static class b {

        /* renamed from: r0, reason: collision with root package name */
        private static SparseIntArray f8491r0;

        /* renamed from: d, reason: collision with root package name */
        public int f8524d;

        /* renamed from: e, reason: collision with root package name */
        public int f8526e;

        /* renamed from: k0, reason: collision with root package name */
        public int[] f8539k0;

        /* renamed from: l0, reason: collision with root package name */
        public String f8541l0;

        /* renamed from: m0, reason: collision with root package name */
        public String f8543m0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f8518a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f8520b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8522c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f8528f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f8530g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f8532h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public boolean f8534i = true;

        /* renamed from: j, reason: collision with root package name */
        public int f8536j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f8538k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f8540l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f8542m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f8544n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f8546o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f8548p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f8550q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f8552r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f8553s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f8554t = -1;

        /* renamed from: u, reason: collision with root package name */
        public int f8555u = -1;

        /* renamed from: v, reason: collision with root package name */
        public int f8556v = -1;

        /* renamed from: w, reason: collision with root package name */
        public int f8557w = -1;

        /* renamed from: x, reason: collision with root package name */
        public int f8558x = -1;

        /* renamed from: y, reason: collision with root package name */
        public float f8559y = 0.5f;

        /* renamed from: z, reason: collision with root package name */
        public float f8560z = 0.5f;

        /* renamed from: A, reason: collision with root package name */
        public String f8492A = null;

        /* renamed from: B, reason: collision with root package name */
        public int f8493B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f8494C = 0;

        /* renamed from: D, reason: collision with root package name */
        public float f8495D = 0.0f;

        /* renamed from: E, reason: collision with root package name */
        public int f8496E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f8497F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f8498G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f8499H = 0;

        /* renamed from: I, reason: collision with root package name */
        public int f8500I = 0;

        /* renamed from: J, reason: collision with root package name */
        public int f8501J = 0;

        /* renamed from: K, reason: collision with root package name */
        public int f8502K = 0;

        /* renamed from: L, reason: collision with root package name */
        public int f8503L = 0;

        /* renamed from: M, reason: collision with root package name */
        public int f8504M = 0;

        /* renamed from: N, reason: collision with root package name */
        public int f8505N = 0;

        /* renamed from: O, reason: collision with root package name */
        public int f8506O = Integer.MIN_VALUE;

        /* renamed from: P, reason: collision with root package name */
        public int f8507P = Integer.MIN_VALUE;

        /* renamed from: Q, reason: collision with root package name */
        public int f8508Q = Integer.MIN_VALUE;

        /* renamed from: R, reason: collision with root package name */
        public int f8509R = Integer.MIN_VALUE;

        /* renamed from: S, reason: collision with root package name */
        public int f8510S = Integer.MIN_VALUE;

        /* renamed from: T, reason: collision with root package name */
        public int f8511T = Integer.MIN_VALUE;

        /* renamed from: U, reason: collision with root package name */
        public int f8512U = Integer.MIN_VALUE;

        /* renamed from: V, reason: collision with root package name */
        public float f8513V = -1.0f;

        /* renamed from: W, reason: collision with root package name */
        public float f8514W = -1.0f;

        /* renamed from: X, reason: collision with root package name */
        public int f8515X = 0;

        /* renamed from: Y, reason: collision with root package name */
        public int f8516Y = 0;

        /* renamed from: Z, reason: collision with root package name */
        public int f8517Z = 0;

        /* renamed from: a0, reason: collision with root package name */
        public int f8519a0 = 0;

        /* renamed from: b0, reason: collision with root package name */
        public int f8521b0 = 0;

        /* renamed from: c0, reason: collision with root package name */
        public int f8523c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f8525d0 = 0;

        /* renamed from: e0, reason: collision with root package name */
        public int f8527e0 = 0;

        /* renamed from: f0, reason: collision with root package name */
        public float f8529f0 = 1.0f;

        /* renamed from: g0, reason: collision with root package name */
        public float f8531g0 = 1.0f;

        /* renamed from: h0, reason: collision with root package name */
        public int f8533h0 = -1;

        /* renamed from: i0, reason: collision with root package name */
        public int f8535i0 = 0;

        /* renamed from: j0, reason: collision with root package name */
        public int f8537j0 = -1;

        /* renamed from: n0, reason: collision with root package name */
        public boolean f8545n0 = false;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f8547o0 = false;

        /* renamed from: p0, reason: collision with root package name */
        public boolean f8549p0 = true;

        /* renamed from: q0, reason: collision with root package name */
        public int f8551q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8491r0 = sparseIntArray;
            sparseIntArray.append(h.f8618C5, 24);
            f8491r0.append(h.f8626D5, 25);
            f8491r0.append(h.f8642F5, 28);
            f8491r0.append(h.f8650G5, 29);
            f8491r0.append(h.f8690L5, 35);
            f8491r0.append(h.f8682K5, 34);
            f8491r0.append(h.f8900l5, 4);
            f8491r0.append(h.f8892k5, 3);
            f8491r0.append(h.f8876i5, 1);
            f8491r0.append(h.f8754T5, 6);
            f8491r0.append(h.f8762U5, 7);
            f8491r0.append(h.f8956s5, 17);
            f8491r0.append(h.f8964t5, 18);
            f8491r0.append(h.f8972u5, 19);
            f8491r0.append(h.f8844e5, 90);
            f8491r0.append(h.f8729Q4, 26);
            f8491r0.append(h.f8658H5, 31);
            f8491r0.append(h.f8666I5, 32);
            f8491r0.append(h.f8948r5, 10);
            f8491r0.append(h.f8940q5, 9);
            f8491r0.append(h.f8786X5, 13);
            f8491r0.append(h.f8811a6, 16);
            f8491r0.append(h.f8794Y5, 14);
            f8491r0.append(h.f8770V5, 11);
            f8491r0.append(h.f8802Z5, 15);
            f8491r0.append(h.f8778W5, 12);
            f8491r0.append(h.f8714O5, 38);
            f8491r0.append(h.f8602A5, 37);
            f8491r0.append(h.f9012z5, 39);
            f8491r0.append(h.f8706N5, 40);
            f8491r0.append(h.f9004y5, 20);
            f8491r0.append(h.f8698M5, 36);
            f8491r0.append(h.f8932p5, 5);
            f8491r0.append(h.f8610B5, 91);
            f8491r0.append(h.f8674J5, 91);
            f8491r0.append(h.f8634E5, 91);
            f8491r0.append(h.f8884j5, 91);
            f8491r0.append(h.f8868h5, 91);
            f8491r0.append(h.f8753T4, 23);
            f8491r0.append(h.f8769V4, 27);
            f8491r0.append(h.f8785X4, 30);
            f8491r0.append(h.f8793Y4, 8);
            f8491r0.append(h.f8761U4, 33);
            f8491r0.append(h.f8777W4, 2);
            f8491r0.append(h.f8737R4, 22);
            f8491r0.append(h.f8745S4, 21);
            f8491r0.append(h.f8722P5, 41);
            f8491r0.append(h.f8980v5, 42);
            f8491r0.append(h.f8860g5, 87);
            f8491r0.append(h.f8852f5, 88);
            f8491r0.append(h.f8820b6, 76);
            f8491r0.append(h.f8908m5, 61);
            f8491r0.append(h.f8924o5, 62);
            f8491r0.append(h.f8916n5, 63);
            f8491r0.append(h.f8746S5, 69);
            f8491r0.append(h.f8996x5, 70);
            f8491r0.append(h.f8828c5, 71);
            f8491r0.append(h.f8810a5, 72);
            f8491r0.append(h.f8819b5, 73);
            f8491r0.append(h.f8836d5, 74);
            f8491r0.append(h.f8801Z4, 75);
            f8491r0.append(h.f8730Q5, 84);
            f8491r0.append(h.f8738R5, 86);
            f8491r0.append(h.f8730Q5, 83);
            f8491r0.append(h.f8988w5, 85);
            f8491r0.append(h.f8722P5, 87);
            f8491r0.append(h.f8980v5, 88);
            f8491r0.append(h.f8953s2, 89);
            f8491r0.append(h.f8844e5, 90);
        }

        public void a(b bVar) {
            this.f8518a = bVar.f8518a;
            this.f8524d = bVar.f8524d;
            this.f8520b = bVar.f8520b;
            this.f8526e = bVar.f8526e;
            this.f8528f = bVar.f8528f;
            this.f8530g = bVar.f8530g;
            this.f8532h = bVar.f8532h;
            this.f8534i = bVar.f8534i;
            this.f8536j = bVar.f8536j;
            this.f8538k = bVar.f8538k;
            this.f8540l = bVar.f8540l;
            this.f8542m = bVar.f8542m;
            this.f8544n = bVar.f8544n;
            this.f8546o = bVar.f8546o;
            this.f8548p = bVar.f8548p;
            this.f8550q = bVar.f8550q;
            this.f8552r = bVar.f8552r;
            this.f8553s = bVar.f8553s;
            this.f8554t = bVar.f8554t;
            this.f8555u = bVar.f8555u;
            this.f8556v = bVar.f8556v;
            this.f8557w = bVar.f8557w;
            this.f8558x = bVar.f8558x;
            this.f8559y = bVar.f8559y;
            this.f8560z = bVar.f8560z;
            this.f8492A = bVar.f8492A;
            this.f8493B = bVar.f8493B;
            this.f8494C = bVar.f8494C;
            this.f8495D = bVar.f8495D;
            this.f8496E = bVar.f8496E;
            this.f8497F = bVar.f8497F;
            this.f8498G = bVar.f8498G;
            this.f8499H = bVar.f8499H;
            this.f8500I = bVar.f8500I;
            this.f8501J = bVar.f8501J;
            this.f8502K = bVar.f8502K;
            this.f8503L = bVar.f8503L;
            this.f8504M = bVar.f8504M;
            this.f8505N = bVar.f8505N;
            this.f8506O = bVar.f8506O;
            this.f8507P = bVar.f8507P;
            this.f8508Q = bVar.f8508Q;
            this.f8509R = bVar.f8509R;
            this.f8510S = bVar.f8510S;
            this.f8511T = bVar.f8511T;
            this.f8512U = bVar.f8512U;
            this.f8513V = bVar.f8513V;
            this.f8514W = bVar.f8514W;
            this.f8515X = bVar.f8515X;
            this.f8516Y = bVar.f8516Y;
            this.f8517Z = bVar.f8517Z;
            this.f8519a0 = bVar.f8519a0;
            this.f8521b0 = bVar.f8521b0;
            this.f8523c0 = bVar.f8523c0;
            this.f8525d0 = bVar.f8525d0;
            this.f8527e0 = bVar.f8527e0;
            this.f8529f0 = bVar.f8529f0;
            this.f8531g0 = bVar.f8531g0;
            this.f8533h0 = bVar.f8533h0;
            this.f8535i0 = bVar.f8535i0;
            this.f8537j0 = bVar.f8537j0;
            this.f8543m0 = bVar.f8543m0;
            int[] iArr = bVar.f8539k0;
            if (iArr == null || bVar.f8541l0 != null) {
                this.f8539k0 = null;
            } else {
                this.f8539k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f8541l0 = bVar.f8541l0;
            this.f8545n0 = bVar.f8545n0;
            this.f8547o0 = bVar.f8547o0;
            this.f8549p0 = bVar.f8549p0;
            this.f8551q0 = bVar.f8551q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f8721P4);
            this.f8520b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                int i9 = f8491r0.get(index);
                switch (i9) {
                    case 1:
                        this.f8552r = e.m(obtainStyledAttributes, index, this.f8552r);
                        break;
                    case 2:
                        this.f8502K = obtainStyledAttributes.getDimensionPixelSize(index, this.f8502K);
                        break;
                    case 3:
                        this.f8550q = e.m(obtainStyledAttributes, index, this.f8550q);
                        break;
                    case 4:
                        this.f8548p = e.m(obtainStyledAttributes, index, this.f8548p);
                        break;
                    case 5:
                        this.f8492A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f8496E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8496E);
                        break;
                    case 7:
                        this.f8497F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8497F);
                        break;
                    case 8:
                        this.f8503L = obtainStyledAttributes.getDimensionPixelSize(index, this.f8503L);
                        break;
                    case 9:
                        this.f8558x = e.m(obtainStyledAttributes, index, this.f8558x);
                        break;
                    case 10:
                        this.f8557w = e.m(obtainStyledAttributes, index, this.f8557w);
                        break;
                    case 11:
                        this.f8509R = obtainStyledAttributes.getDimensionPixelSize(index, this.f8509R);
                        break;
                    case 12:
                        this.f8510S = obtainStyledAttributes.getDimensionPixelSize(index, this.f8510S);
                        break;
                    case 13:
                        this.f8506O = obtainStyledAttributes.getDimensionPixelSize(index, this.f8506O);
                        break;
                    case 14:
                        this.f8508Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f8508Q);
                        break;
                    case 15:
                        this.f8511T = obtainStyledAttributes.getDimensionPixelSize(index, this.f8511T);
                        break;
                    case 16:
                        this.f8507P = obtainStyledAttributes.getDimensionPixelSize(index, this.f8507P);
                        break;
                    case 17:
                        this.f8528f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8528f);
                        break;
                    case 18:
                        this.f8530g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8530g);
                        break;
                    case 19:
                        this.f8532h = obtainStyledAttributes.getFloat(index, this.f8532h);
                        break;
                    case 20:
                        this.f8559y = obtainStyledAttributes.getFloat(index, this.f8559y);
                        break;
                    case C1445Je.zzm /* 21 */:
                        this.f8526e = obtainStyledAttributes.getLayoutDimension(index, this.f8526e);
                        break;
                    case 22:
                        this.f8524d = obtainStyledAttributes.getLayoutDimension(index, this.f8524d);
                        break;
                    case 23:
                        this.f8499H = obtainStyledAttributes.getDimensionPixelSize(index, this.f8499H);
                        break;
                    case 24:
                        this.f8536j = e.m(obtainStyledAttributes, index, this.f8536j);
                        break;
                    case 25:
                        this.f8538k = e.m(obtainStyledAttributes, index, this.f8538k);
                        break;
                    case 26:
                        this.f8498G = obtainStyledAttributes.getInt(index, this.f8498G);
                        break;
                    case 27:
                        this.f8500I = obtainStyledAttributes.getDimensionPixelSize(index, this.f8500I);
                        break;
                    case 28:
                        this.f8540l = e.m(obtainStyledAttributes, index, this.f8540l);
                        break;
                    case 29:
                        this.f8542m = e.m(obtainStyledAttributes, index, this.f8542m);
                        break;
                    case 30:
                        this.f8504M = obtainStyledAttributes.getDimensionPixelSize(index, this.f8504M);
                        break;
                    case 31:
                        this.f8555u = e.m(obtainStyledAttributes, index, this.f8555u);
                        break;
                    case 32:
                        this.f8556v = e.m(obtainStyledAttributes, index, this.f8556v);
                        break;
                    case 33:
                        this.f8501J = obtainStyledAttributes.getDimensionPixelSize(index, this.f8501J);
                        break;
                    case 34:
                        this.f8546o = e.m(obtainStyledAttributes, index, this.f8546o);
                        break;
                    case 35:
                        this.f8544n = e.m(obtainStyledAttributes, index, this.f8544n);
                        break;
                    case 36:
                        this.f8560z = obtainStyledAttributes.getFloat(index, this.f8560z);
                        break;
                    case 37:
                        this.f8514W = obtainStyledAttributes.getFloat(index, this.f8514W);
                        break;
                    case 38:
                        this.f8513V = obtainStyledAttributes.getFloat(index, this.f8513V);
                        break;
                    case 39:
                        this.f8515X = obtainStyledAttributes.getInt(index, this.f8515X);
                        break;
                    case 40:
                        this.f8516Y = obtainStyledAttributes.getInt(index, this.f8516Y);
                        break;
                    case 41:
                        e.n(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        e.n(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i9) {
                            case 61:
                                this.f8493B = e.m(obtainStyledAttributes, index, this.f8493B);
                                break;
                            case 62:
                                this.f8494C = obtainStyledAttributes.getDimensionPixelSize(index, this.f8494C);
                                break;
                            case 63:
                                this.f8495D = obtainStyledAttributes.getFloat(index, this.f8495D);
                                break;
                            default:
                                switch (i9) {
                                    case 69:
                                        this.f8529f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f8531g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f8533h0 = obtainStyledAttributes.getInt(index, this.f8533h0);
                                        break;
                                    case 73:
                                        this.f8535i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8535i0);
                                        break;
                                    case 74:
                                        this.f8541l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f8549p0 = obtainStyledAttributes.getBoolean(index, this.f8549p0);
                                        break;
                                    case 76:
                                        this.f8551q0 = obtainStyledAttributes.getInt(index, this.f8551q0);
                                        break;
                                    case 77:
                                        this.f8553s = e.m(obtainStyledAttributes, index, this.f8553s);
                                        break;
                                    case 78:
                                        this.f8554t = e.m(obtainStyledAttributes, index, this.f8554t);
                                        break;
                                    case 79:
                                        this.f8512U = obtainStyledAttributes.getDimensionPixelSize(index, this.f8512U);
                                        break;
                                    case 80:
                                        this.f8505N = obtainStyledAttributes.getDimensionPixelSize(index, this.f8505N);
                                        break;
                                    case 81:
                                        this.f8517Z = obtainStyledAttributes.getInt(index, this.f8517Z);
                                        break;
                                    case 82:
                                        this.f8519a0 = obtainStyledAttributes.getInt(index, this.f8519a0);
                                        break;
                                    case 83:
                                        this.f8523c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8523c0);
                                        break;
                                    case 84:
                                        this.f8521b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8521b0);
                                        break;
                                    case 85:
                                        this.f8527e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8527e0);
                                        break;
                                    case 86:
                                        this.f8525d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f8525d0);
                                        break;
                                    case 87:
                                        this.f8545n0 = obtainStyledAttributes.getBoolean(index, this.f8545n0);
                                        break;
                                    case 88:
                                        this.f8547o0 = obtainStyledAttributes.getBoolean(index, this.f8547o0);
                                        break;
                                    case 89:
                                        this.f8543m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f8534i = obtainStyledAttributes.getBoolean(index, this.f8534i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8491r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8491r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f8561o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f8562a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f8563b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f8564c = 0;

        /* renamed from: d, reason: collision with root package name */
        public String f8565d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f8566e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f8567f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f8568g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public int f8569h = -1;

        /* renamed from: i, reason: collision with root package name */
        public float f8570i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f8571j = Float.NaN;

        /* renamed from: k, reason: collision with root package name */
        public int f8572k = -1;

        /* renamed from: l, reason: collision with root package name */
        public String f8573l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f8574m = -3;

        /* renamed from: n, reason: collision with root package name */
        public int f8575n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8561o = sparseIntArray;
            sparseIntArray.append(h.f8869h6, 1);
            f8561o.append(h.f8885j6, 2);
            f8561o.append(h.f8917n6, 3);
            f8561o.append(h.f8861g6, 4);
            f8561o.append(h.f8853f6, 5);
            f8561o.append(h.f8845e6, 6);
            f8561o.append(h.f8877i6, 7);
            f8561o.append(h.f8909m6, 8);
            f8561o.append(h.f8901l6, 9);
            f8561o.append(h.f8893k6, 10);
        }

        public void a(c cVar) {
            this.f8562a = cVar.f8562a;
            this.f8563b = cVar.f8563b;
            this.f8565d = cVar.f8565d;
            this.f8566e = cVar.f8566e;
            this.f8567f = cVar.f8567f;
            this.f8570i = cVar.f8570i;
            this.f8568g = cVar.f8568g;
            this.f8569h = cVar.f8569h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f8837d6);
            this.f8562a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                switch (f8561o.get(index)) {
                    case 1:
                        this.f8570i = obtainStyledAttributes.getFloat(index, this.f8570i);
                        break;
                    case 2:
                        this.f8566e = obtainStyledAttributes.getInt(index, this.f8566e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f8565d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f8565d = C5822a.f36182c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f8567f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f8563b = e.m(obtainStyledAttributes, index, this.f8563b);
                        break;
                    case 6:
                        this.f8564c = obtainStyledAttributes.getInteger(index, this.f8564c);
                        break;
                    case 7:
                        this.f8568g = obtainStyledAttributes.getFloat(index, this.f8568g);
                        break;
                    case 8:
                        this.f8572k = obtainStyledAttributes.getInteger(index, this.f8572k);
                        break;
                    case 9:
                        this.f8571j = obtainStyledAttributes.getFloat(index, this.f8571j);
                        break;
                    case 10:
                        int i9 = obtainStyledAttributes.peekValue(index).type;
                        if (i9 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f8575n = resourceId;
                            if (resourceId != -1) {
                                this.f8574m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i9 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f8573l = string;
                            if (string.indexOf("/") > 0) {
                                this.f8575n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f8574m = -2;
                                break;
                            } else {
                                this.f8574m = -1;
                                break;
                            }
                        } else {
                            this.f8574m = obtainStyledAttributes.getInteger(index, this.f8575n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f8576a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f8577b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f8578c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f8579d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f8580e = Float.NaN;

        public void a(d dVar) {
            this.f8576a = dVar.f8576a;
            this.f8577b = dVar.f8577b;
            this.f8579d = dVar.f8579d;
            this.f8580e = dVar.f8580e;
            this.f8578c = dVar.f8578c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f8989w6);
            this.f8576a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == h.f9005y6) {
                    this.f8579d = obtainStyledAttributes.getFloat(index, this.f8579d);
                } else if (index == h.f8997x6) {
                    this.f8577b = obtainStyledAttributes.getInt(index, this.f8577b);
                    this.f8577b = e.f8462g[this.f8577b];
                } else if (index == h.f8603A6) {
                    this.f8578c = obtainStyledAttributes.getInt(index, this.f8578c);
                } else if (index == h.f9013z6) {
                    this.f8580e = obtainStyledAttributes.getFloat(index, this.f8580e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    public static class C0151e {

        /* renamed from: o, reason: collision with root package name */
        private static SparseIntArray f8581o;

        /* renamed from: a, reason: collision with root package name */
        public boolean f8582a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f8583b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f8584c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f8585d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f8586e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f8587f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f8588g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f8589h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public int f8590i = -1;

        /* renamed from: j, reason: collision with root package name */
        public float f8591j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f8592k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public float f8593l = 0.0f;

        /* renamed from: m, reason: collision with root package name */
        public boolean f8594m = false;

        /* renamed from: n, reason: collision with root package name */
        public float f8595n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8581o = sparseIntArray;
            sparseIntArray.append(h.f8707N6, 1);
            f8581o.append(h.f8715O6, 2);
            f8581o.append(h.f8723P6, 3);
            f8581o.append(h.f8691L6, 4);
            f8581o.append(h.f8699M6, 5);
            f8581o.append(h.f8659H6, 6);
            f8581o.append(h.f8667I6, 7);
            f8581o.append(h.f8675J6, 8);
            f8581o.append(h.f8683K6, 9);
            f8581o.append(h.f8731Q6, 10);
            f8581o.append(h.f8739R6, 11);
            f8581o.append(h.f8747S6, 12);
        }

        public void a(C0151e c0151e) {
            this.f8582a = c0151e.f8582a;
            this.f8583b = c0151e.f8583b;
            this.f8584c = c0151e.f8584c;
            this.f8585d = c0151e.f8585d;
            this.f8586e = c0151e.f8586e;
            this.f8587f = c0151e.f8587f;
            this.f8588g = c0151e.f8588g;
            this.f8589h = c0151e.f8589h;
            this.f8590i = c0151e.f8590i;
            this.f8591j = c0151e.f8591j;
            this.f8592k = c0151e.f8592k;
            this.f8593l = c0151e.f8593l;
            this.f8594m = c0151e.f8594m;
            this.f8595n = c0151e.f8595n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f8651G6);
            this.f8582a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                switch (f8581o.get(index)) {
                    case 1:
                        this.f8583b = obtainStyledAttributes.getFloat(index, this.f8583b);
                        break;
                    case 2:
                        this.f8584c = obtainStyledAttributes.getFloat(index, this.f8584c);
                        break;
                    case 3:
                        this.f8585d = obtainStyledAttributes.getFloat(index, this.f8585d);
                        break;
                    case 4:
                        this.f8586e = obtainStyledAttributes.getFloat(index, this.f8586e);
                        break;
                    case 5:
                        this.f8587f = obtainStyledAttributes.getFloat(index, this.f8587f);
                        break;
                    case 6:
                        this.f8588g = obtainStyledAttributes.getDimension(index, this.f8588g);
                        break;
                    case 7:
                        this.f8589h = obtainStyledAttributes.getDimension(index, this.f8589h);
                        break;
                    case 8:
                        this.f8591j = obtainStyledAttributes.getDimension(index, this.f8591j);
                        break;
                    case 9:
                        this.f8592k = obtainStyledAttributes.getDimension(index, this.f8592k);
                        break;
                    case 10:
                        this.f8593l = obtainStyledAttributes.getDimension(index, this.f8593l);
                        break;
                    case 11:
                        this.f8594m = true;
                        this.f8595n = obtainStyledAttributes.getDimension(index, this.f8595n);
                        break;
                    case 12:
                        this.f8590i = e.m(obtainStyledAttributes, index, this.f8590i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f8463h.append(h.f8871i0, 25);
        f8463h.append(h.f8879j0, 26);
        f8463h.append(h.f8895l0, 29);
        f8463h.append(h.f8903m0, 30);
        f8463h.append(h.f8951s0, 36);
        f8463h.append(h.f8943r0, 35);
        f8463h.append(h.f8716P, 4);
        f8463h.append(h.f8708O, 3);
        f8463h.append(h.f8676K, 1);
        f8463h.append(h.f8692M, 91);
        f8463h.append(h.f8684L, 92);
        f8463h.append(h.f8605B0, 6);
        f8463h.append(h.f8613C0, 7);
        f8463h.append(h.f8772W, 17);
        f8463h.append(h.f8780X, 18);
        f8463h.append(h.f8788Y, 19);
        f8463h.append(h.f8644G, 99);
        f8463h.append(h.f8822c, 27);
        f8463h.append(h.f8911n0, 32);
        f8463h.append(h.f8919o0, 33);
        f8463h.append(h.f8764V, 10);
        f8463h.append(h.f8756U, 9);
        f8463h.append(h.f8637F0, 13);
        f8463h.append(h.f8661I0, 16);
        f8463h.append(h.f8645G0, 14);
        f8463h.append(h.f8621D0, 11);
        f8463h.append(h.f8653H0, 15);
        f8463h.append(h.f8629E0, 12);
        f8463h.append(h.f8975v0, 40);
        f8463h.append(h.f8855g0, 39);
        f8463h.append(h.f8847f0, 41);
        f8463h.append(h.f8967u0, 42);
        f8463h.append(h.f8839e0, 20);
        f8463h.append(h.f8959t0, 37);
        f8463h.append(h.f8748T, 5);
        f8463h.append(h.f8863h0, 87);
        f8463h.append(h.f8935q0, 87);
        f8463h.append(h.f8887k0, 87);
        f8463h.append(h.f8700N, 87);
        f8463h.append(h.f8668J, 87);
        f8463h.append(h.f8862h, 24);
        f8463h.append(h.f8878j, 28);
        f8463h.append(h.f8974v, 31);
        f8463h.append(h.f8982w, 8);
        f8463h.append(h.f8870i, 34);
        f8463h.append(h.f8886k, 2);
        f8463h.append(h.f8846f, 23);
        f8463h.append(h.f8854g, 21);
        f8463h.append(h.f8983w0, 95);
        f8463h.append(h.f8796Z, 96);
        f8463h.append(h.f8838e, 22);
        f8463h.append(h.f8894l, 43);
        f8463h.append(h.f8998y, 44);
        f8463h.append(h.f8958t, 45);
        f8463h.append(h.f8966u, 46);
        f8463h.append(h.f8950s, 60);
        f8463h.append(h.f8934q, 47);
        f8463h.append(h.f8942r, 48);
        f8463h.append(h.f8902m, 49);
        f8463h.append(h.f8910n, 50);
        f8463h.append(h.f8918o, 51);
        f8463h.append(h.f8926p, 52);
        f8463h.append(h.f8990x, 53);
        f8463h.append(h.f8991x0, 54);
        f8463h.append(h.f8805a0, 55);
        f8463h.append(h.f8999y0, 56);
        f8463h.append(h.f8814b0, 57);
        f8463h.append(h.f9007z0, 58);
        f8463h.append(h.f8823c0, 59);
        f8463h.append(h.f8724Q, 61);
        f8463h.append(h.f8740S, 62);
        f8463h.append(h.f8732R, 63);
        f8463h.append(h.f9006z, 64);
        f8463h.append(h.f8741S0, 65);
        f8463h.append(h.f8636F, 66);
        f8463h.append(h.f8749T0, 67);
        f8463h.append(h.f8685L0, 79);
        f8463h.append(h.f8830d, 38);
        f8463h.append(h.f8677K0, 68);
        f8463h.append(h.f8597A0, 69);
        f8463h.append(h.f8831d0, 70);
        f8463h.append(h.f8669J0, 97);
        f8463h.append(h.f8620D, 71);
        f8463h.append(h.f8604B, 72);
        f8463h.append(h.f8612C, 73);
        f8463h.append(h.f8628E, 74);
        f8463h.append(h.f8596A, 75);
        f8463h.append(h.f8693M0, 76);
        f8463h.append(h.f8927p0, 77);
        f8463h.append(h.f8757U0, 78);
        f8463h.append(h.f8660I, 80);
        f8463h.append(h.f8652H, 81);
        f8463h.append(h.f8701N0, 82);
        f8463h.append(h.f8733R0, 83);
        f8463h.append(h.f8725Q0, 84);
        f8463h.append(h.f8717P0, 85);
        f8463h.append(h.f8709O0, 86);
        f8464i.append(h.f8792Y3, 6);
        f8464i.append(h.f8792Y3, 7);
        f8464i.append(h.f8751T2, 27);
        f8464i.append(h.f8818b4, 13);
        f8464i.append(h.f8843e4, 16);
        f8464i.append(h.f8827c4, 14);
        f8464i.append(h.f8800Z3, 11);
        f8464i.append(h.f8835d4, 15);
        f8464i.append(h.f8809a4, 12);
        f8464i.append(h.f8744S3, 40);
        f8464i.append(h.f8688L3, 39);
        f8464i.append(h.f8680K3, 41);
        f8464i.append(h.f8736R3, 42);
        f8464i.append(h.f8672J3, 20);
        f8464i.append(h.f8728Q3, 37);
        f8464i.append(h.f8624D3, 5);
        f8464i.append(h.f8696M3, 87);
        f8464i.append(h.f8720P3, 87);
        f8464i.append(h.f8704N3, 87);
        f8464i.append(h.f8600A3, 87);
        f8464i.append(h.f9010z3, 87);
        f8464i.append(h.f8791Y2, 24);
        f8464i.append(h.f8808a3, 28);
        f8464i.append(h.f8906m3, 31);
        f8464i.append(h.f8914n3, 8);
        f8464i.append(h.f8799Z2, 34);
        f8464i.append(h.f8817b3, 2);
        f8464i.append(h.f8775W2, 23);
        f8464i.append(h.f8783X2, 21);
        f8464i.append(h.f8752T3, 95);
        f8464i.append(h.f8632E3, 96);
        f8464i.append(h.f8767V2, 22);
        f8464i.append(h.f8826c3, 43);
        f8464i.append(h.f8930p3, 44);
        f8464i.append(h.f8890k3, 45);
        f8464i.append(h.f8898l3, 46);
        f8464i.append(h.f8882j3, 60);
        f8464i.append(h.f8866h3, 47);
        f8464i.append(h.f8874i3, 48);
        f8464i.append(h.f8834d3, 49);
        f8464i.append(h.f8842e3, 50);
        f8464i.append(h.f8850f3, 51);
        f8464i.append(h.f8858g3, 52);
        f8464i.append(h.f8922o3, 53);
        f8464i.append(h.f8760U3, 54);
        f8464i.append(h.f8640F3, 55);
        f8464i.append(h.f8768V3, 56);
        f8464i.append(h.f8648G3, 57);
        f8464i.append(h.f8776W3, 58);
        f8464i.append(h.f8656H3, 59);
        f8464i.append(h.f8616C3, 62);
        f8464i.append(h.f8608B3, 63);
        f8464i.append(h.f8938q3, 64);
        f8464i.append(h.f8931p4, 65);
        f8464i.append(h.f8986w3, 66);
        f8464i.append(h.f8939q4, 67);
        f8464i.append(h.f8867h4, 79);
        f8464i.append(h.f8759U2, 38);
        f8464i.append(h.f8875i4, 98);
        f8464i.append(h.f8859g4, 68);
        f8464i.append(h.f8784X3, 69);
        f8464i.append(h.f8664I3, 70);
        f8464i.append(h.f8970u3, 71);
        f8464i.append(h.f8954s3, 72);
        f8464i.append(h.f8962t3, 73);
        f8464i.append(h.f8978v3, 74);
        f8464i.append(h.f8946r3, 75);
        f8464i.append(h.f8883j4, 76);
        f8464i.append(h.f8712O3, 77);
        f8464i.append(h.f8947r4, 78);
        f8464i.append(h.f9002y3, 80);
        f8464i.append(h.f8994x3, 81);
        f8464i.append(h.f8891k4, 82);
        f8464i.append(h.f8923o4, 83);
        f8464i.append(h.f8915n4, 84);
        f8464i.append(h.f8907m4, 85);
        f8464i.append(h.f8899l4, 86);
        f8464i.append(h.f8851f4, 97);
    }

    private int[] h(View view, String str) {
        int i8;
        Object i9;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            try {
                i8 = g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i8 = 0;
            }
            if (i8 == 0) {
                i8 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i8 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (i9 = ((ConstraintLayout) view.getParent()).i(0, trim)) != null && (i9 instanceof Integer)) {
                i8 = ((Integer) i9).intValue();
            }
            iArr[i11] = i8;
            i10++;
            i11++;
        }
        return i11 != split.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z7) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z7 ? h.f8743S2 : h.f8813b);
        q(aVar, obtainStyledAttributes, z7);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i8) {
        if (!this.f8470f.containsKey(Integer.valueOf(i8))) {
            this.f8470f.put(Integer.valueOf(i8), new a());
        }
        return (a) this.f8470f.get(Integer.valueOf(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(TypedArray typedArray, int i8, int i9) {
        int resourceId = typedArray.getResourceId(i8, i9);
        return resourceId == -1 ? typedArray.getInt(i8, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void n(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L71
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L26
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r0) goto L22
            r6 = -1
            if (r5 == r6) goto L22
        L20:
            r5 = r2
            goto L2f
        L22:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L2f
        L26:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2f
        L2a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L22
        L2f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L41
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3c
            r4.width = r2
            r4.f8360a0 = r5
            goto L70
        L3c:
            r4.height = r2
            r4.f8362b0 = r5
            goto L70
        L41:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.b
            if (r6 == 0) goto L53
            androidx.constraintlayout.widget.e$b r4 = (androidx.constraintlayout.widget.e.b) r4
            if (r7 != 0) goto L4e
            r4.f8524d = r2
            r4.f8545n0 = r5
            goto L70
        L4e:
            r4.f8526e = r2
            r4.f8547o0 = r5
            goto L70
        L53:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.e.a.C0150a
            if (r6 == 0) goto L70
            androidx.constraintlayout.widget.e$a$a r4 = (androidx.constraintlayout.widget.e.a.C0150a) r4
            if (r7 != 0) goto L66
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L70
        L66:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L70:
            return
        L71:
            java.lang.String r5 = r5.getString(r6)
            o(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void o(Object obj, String str, int i8) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i8 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    p(bVar, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f8492A = trim2;
                    return;
                } else {
                    if (obj instanceof a.C0150a) {
                        ((a.C0150a) obj).c(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i8 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.f8344L = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.f8345M = parseFloat;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i8 == 0) {
                            bVar3.f8524d = 0;
                            bVar3.f8514W = parseFloat;
                        } else {
                            bVar3.f8526e = 0;
                            bVar3.f8513V = parseFloat;
                        }
                    } else if (obj instanceof a.C0150a) {
                        a.C0150a c0150a = (a.C0150a) obj;
                        if (i8 == 0) {
                            c0150a.b(23, 0);
                            c0150a.a(39, parseFloat);
                        } else {
                            c0150a.b(21, 0);
                            c0150a.a(40, parseFloat);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(trim)) {
                        return;
                    }
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i8 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.f8354V = max;
                            bVar4.f8348P = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.f8355W = max;
                            bVar4.f8349Q = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i8 == 0) {
                            bVar5.f8524d = 0;
                            bVar5.f8529f0 = max;
                            bVar5.f8517Z = 2;
                        } else {
                            bVar5.f8526e = 0;
                            bVar5.f8531g0 = max;
                            bVar5.f8519a0 = 2;
                        }
                    } else if (obj instanceof a.C0150a) {
                        a.C0150a c0150a2 = (a.C0150a) obj;
                        if (i8 == 0) {
                            c0150a2.b(23, 0);
                            c0150a2.b(54, 2);
                        } else {
                            c0150a2.b(21, 0);
                            c0150a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void p(ConstraintLayout.b bVar, String str) {
        float f8 = Float.NaN;
        int i8 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i9 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i8 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i8 = 1;
                }
                i9 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i9);
                    if (substring2.length() > 0) {
                        f8 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i9, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f8 = i8 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f8341I = str;
        bVar.f8342J = f8;
        bVar.f8343K = i8;
    }

    private void q(a aVar, TypedArray typedArray, boolean z7) {
        if (z7) {
            r(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArray.getIndex(i8);
            if (index != h.f8830d && h.f8974v != index && h.f8982w != index) {
                aVar.f8474d.f8562a = true;
                aVar.f8475e.f8520b = true;
                aVar.f8473c.f8576a = true;
                aVar.f8476f.f8582a = true;
            }
            switch (f8463h.get(index)) {
                case 1:
                    b bVar = aVar.f8475e;
                    bVar.f8552r = m(typedArray, index, bVar.f8552r);
                    break;
                case 2:
                    b bVar2 = aVar.f8475e;
                    bVar2.f8502K = typedArray.getDimensionPixelSize(index, bVar2.f8502K);
                    break;
                case 3:
                    b bVar3 = aVar.f8475e;
                    bVar3.f8550q = m(typedArray, index, bVar3.f8550q);
                    break;
                case 4:
                    b bVar4 = aVar.f8475e;
                    bVar4.f8548p = m(typedArray, index, bVar4.f8548p);
                    break;
                case 5:
                    aVar.f8475e.f8492A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f8475e;
                    bVar5.f8496E = typedArray.getDimensionPixelOffset(index, bVar5.f8496E);
                    break;
                case 7:
                    b bVar6 = aVar.f8475e;
                    bVar6.f8497F = typedArray.getDimensionPixelOffset(index, bVar6.f8497F);
                    break;
                case 8:
                    b bVar7 = aVar.f8475e;
                    bVar7.f8503L = typedArray.getDimensionPixelSize(index, bVar7.f8503L);
                    break;
                case 9:
                    b bVar8 = aVar.f8475e;
                    bVar8.f8558x = m(typedArray, index, bVar8.f8558x);
                    break;
                case 10:
                    b bVar9 = aVar.f8475e;
                    bVar9.f8557w = m(typedArray, index, bVar9.f8557w);
                    break;
                case 11:
                    b bVar10 = aVar.f8475e;
                    bVar10.f8509R = typedArray.getDimensionPixelSize(index, bVar10.f8509R);
                    break;
                case 12:
                    b bVar11 = aVar.f8475e;
                    bVar11.f8510S = typedArray.getDimensionPixelSize(index, bVar11.f8510S);
                    break;
                case 13:
                    b bVar12 = aVar.f8475e;
                    bVar12.f8506O = typedArray.getDimensionPixelSize(index, bVar12.f8506O);
                    break;
                case 14:
                    b bVar13 = aVar.f8475e;
                    bVar13.f8508Q = typedArray.getDimensionPixelSize(index, bVar13.f8508Q);
                    break;
                case 15:
                    b bVar14 = aVar.f8475e;
                    bVar14.f8511T = typedArray.getDimensionPixelSize(index, bVar14.f8511T);
                    break;
                case 16:
                    b bVar15 = aVar.f8475e;
                    bVar15.f8507P = typedArray.getDimensionPixelSize(index, bVar15.f8507P);
                    break;
                case 17:
                    b bVar16 = aVar.f8475e;
                    bVar16.f8528f = typedArray.getDimensionPixelOffset(index, bVar16.f8528f);
                    break;
                case 18:
                    b bVar17 = aVar.f8475e;
                    bVar17.f8530g = typedArray.getDimensionPixelOffset(index, bVar17.f8530g);
                    break;
                case 19:
                    b bVar18 = aVar.f8475e;
                    bVar18.f8532h = typedArray.getFloat(index, bVar18.f8532h);
                    break;
                case 20:
                    b bVar19 = aVar.f8475e;
                    bVar19.f8559y = typedArray.getFloat(index, bVar19.f8559y);
                    break;
                case C1445Je.zzm /* 21 */:
                    b bVar20 = aVar.f8475e;
                    bVar20.f8526e = typedArray.getLayoutDimension(index, bVar20.f8526e);
                    break;
                case 22:
                    d dVar = aVar.f8473c;
                    dVar.f8577b = typedArray.getInt(index, dVar.f8577b);
                    d dVar2 = aVar.f8473c;
                    dVar2.f8577b = f8462g[dVar2.f8577b];
                    break;
                case 23:
                    b bVar21 = aVar.f8475e;
                    bVar21.f8524d = typedArray.getLayoutDimension(index, bVar21.f8524d);
                    break;
                case 24:
                    b bVar22 = aVar.f8475e;
                    bVar22.f8499H = typedArray.getDimensionPixelSize(index, bVar22.f8499H);
                    break;
                case 25:
                    b bVar23 = aVar.f8475e;
                    bVar23.f8536j = m(typedArray, index, bVar23.f8536j);
                    break;
                case 26:
                    b bVar24 = aVar.f8475e;
                    bVar24.f8538k = m(typedArray, index, bVar24.f8538k);
                    break;
                case 27:
                    b bVar25 = aVar.f8475e;
                    bVar25.f8498G = typedArray.getInt(index, bVar25.f8498G);
                    break;
                case 28:
                    b bVar26 = aVar.f8475e;
                    bVar26.f8500I = typedArray.getDimensionPixelSize(index, bVar26.f8500I);
                    break;
                case 29:
                    b bVar27 = aVar.f8475e;
                    bVar27.f8540l = m(typedArray, index, bVar27.f8540l);
                    break;
                case 30:
                    b bVar28 = aVar.f8475e;
                    bVar28.f8542m = m(typedArray, index, bVar28.f8542m);
                    break;
                case 31:
                    b bVar29 = aVar.f8475e;
                    bVar29.f8504M = typedArray.getDimensionPixelSize(index, bVar29.f8504M);
                    break;
                case 32:
                    b bVar30 = aVar.f8475e;
                    bVar30.f8555u = m(typedArray, index, bVar30.f8555u);
                    break;
                case 33:
                    b bVar31 = aVar.f8475e;
                    bVar31.f8556v = m(typedArray, index, bVar31.f8556v);
                    break;
                case 34:
                    b bVar32 = aVar.f8475e;
                    bVar32.f8501J = typedArray.getDimensionPixelSize(index, bVar32.f8501J);
                    break;
                case 35:
                    b bVar33 = aVar.f8475e;
                    bVar33.f8546o = m(typedArray, index, bVar33.f8546o);
                    break;
                case 36:
                    b bVar34 = aVar.f8475e;
                    bVar34.f8544n = m(typedArray, index, bVar34.f8544n);
                    break;
                case 37:
                    b bVar35 = aVar.f8475e;
                    bVar35.f8560z = typedArray.getFloat(index, bVar35.f8560z);
                    break;
                case 38:
                    aVar.f8471a = typedArray.getResourceId(index, aVar.f8471a);
                    break;
                case 39:
                    b bVar36 = aVar.f8475e;
                    bVar36.f8514W = typedArray.getFloat(index, bVar36.f8514W);
                    break;
                case 40:
                    b bVar37 = aVar.f8475e;
                    bVar37.f8513V = typedArray.getFloat(index, bVar37.f8513V);
                    break;
                case 41:
                    b bVar38 = aVar.f8475e;
                    bVar38.f8515X = typedArray.getInt(index, bVar38.f8515X);
                    break;
                case 42:
                    b bVar39 = aVar.f8475e;
                    bVar39.f8516Y = typedArray.getInt(index, bVar39.f8516Y);
                    break;
                case 43:
                    d dVar3 = aVar.f8473c;
                    dVar3.f8579d = typedArray.getFloat(index, dVar3.f8579d);
                    break;
                case 44:
                    C0151e c0151e = aVar.f8476f;
                    c0151e.f8594m = true;
                    c0151e.f8595n = typedArray.getDimension(index, c0151e.f8595n);
                    break;
                case 45:
                    C0151e c0151e2 = aVar.f8476f;
                    c0151e2.f8584c = typedArray.getFloat(index, c0151e2.f8584c);
                    break;
                case 46:
                    C0151e c0151e3 = aVar.f8476f;
                    c0151e3.f8585d = typedArray.getFloat(index, c0151e3.f8585d);
                    break;
                case 47:
                    C0151e c0151e4 = aVar.f8476f;
                    c0151e4.f8586e = typedArray.getFloat(index, c0151e4.f8586e);
                    break;
                case 48:
                    C0151e c0151e5 = aVar.f8476f;
                    c0151e5.f8587f = typedArray.getFloat(index, c0151e5.f8587f);
                    break;
                case 49:
                    C0151e c0151e6 = aVar.f8476f;
                    c0151e6.f8588g = typedArray.getDimension(index, c0151e6.f8588g);
                    break;
                case 50:
                    C0151e c0151e7 = aVar.f8476f;
                    c0151e7.f8589h = typedArray.getDimension(index, c0151e7.f8589h);
                    break;
                case 51:
                    C0151e c0151e8 = aVar.f8476f;
                    c0151e8.f8591j = typedArray.getDimension(index, c0151e8.f8591j);
                    break;
                case 52:
                    C0151e c0151e9 = aVar.f8476f;
                    c0151e9.f8592k = typedArray.getDimension(index, c0151e9.f8592k);
                    break;
                case 53:
                    C0151e c0151e10 = aVar.f8476f;
                    c0151e10.f8593l = typedArray.getDimension(index, c0151e10.f8593l);
                    break;
                case 54:
                    b bVar40 = aVar.f8475e;
                    bVar40.f8517Z = typedArray.getInt(index, bVar40.f8517Z);
                    break;
                case 55:
                    b bVar41 = aVar.f8475e;
                    bVar41.f8519a0 = typedArray.getInt(index, bVar41.f8519a0);
                    break;
                case 56:
                    b bVar42 = aVar.f8475e;
                    bVar42.f8521b0 = typedArray.getDimensionPixelSize(index, bVar42.f8521b0);
                    break;
                case 57:
                    b bVar43 = aVar.f8475e;
                    bVar43.f8523c0 = typedArray.getDimensionPixelSize(index, bVar43.f8523c0);
                    break;
                case 58:
                    b bVar44 = aVar.f8475e;
                    bVar44.f8525d0 = typedArray.getDimensionPixelSize(index, bVar44.f8525d0);
                    break;
                case 59:
                    b bVar45 = aVar.f8475e;
                    bVar45.f8527e0 = typedArray.getDimensionPixelSize(index, bVar45.f8527e0);
                    break;
                case 60:
                    C0151e c0151e11 = aVar.f8476f;
                    c0151e11.f8583b = typedArray.getFloat(index, c0151e11.f8583b);
                    break;
                case 61:
                    b bVar46 = aVar.f8475e;
                    bVar46.f8493B = m(typedArray, index, bVar46.f8493B);
                    break;
                case 62:
                    b bVar47 = aVar.f8475e;
                    bVar47.f8494C = typedArray.getDimensionPixelSize(index, bVar47.f8494C);
                    break;
                case 63:
                    b bVar48 = aVar.f8475e;
                    bVar48.f8495D = typedArray.getFloat(index, bVar48.f8495D);
                    break;
                case 64:
                    c cVar = aVar.f8474d;
                    cVar.f8563b = m(typedArray, index, cVar.f8563b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f8474d.f8565d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f8474d.f8565d = C5822a.f36182c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f8474d.f8567f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f8474d;
                    cVar2.f8570i = typedArray.getFloat(index, cVar2.f8570i);
                    break;
                case 68:
                    d dVar4 = aVar.f8473c;
                    dVar4.f8580e = typedArray.getFloat(index, dVar4.f8580e);
                    break;
                case 69:
                    aVar.f8475e.f8529f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f8475e.f8531g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f8475e;
                    bVar49.f8533h0 = typedArray.getInt(index, bVar49.f8533h0);
                    break;
                case 73:
                    b bVar50 = aVar.f8475e;
                    bVar50.f8535i0 = typedArray.getDimensionPixelSize(index, bVar50.f8535i0);
                    break;
                case 74:
                    aVar.f8475e.f8541l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f8475e;
                    bVar51.f8549p0 = typedArray.getBoolean(index, bVar51.f8549p0);
                    break;
                case 76:
                    c cVar3 = aVar.f8474d;
                    cVar3.f8566e = typedArray.getInt(index, cVar3.f8566e);
                    break;
                case 77:
                    aVar.f8475e.f8543m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f8473c;
                    dVar5.f8578c = typedArray.getInt(index, dVar5.f8578c);
                    break;
                case 79:
                    c cVar4 = aVar.f8474d;
                    cVar4.f8568g = typedArray.getFloat(index, cVar4.f8568g);
                    break;
                case 80:
                    b bVar52 = aVar.f8475e;
                    bVar52.f8545n0 = typedArray.getBoolean(index, bVar52.f8545n0);
                    break;
                case 81:
                    b bVar53 = aVar.f8475e;
                    bVar53.f8547o0 = typedArray.getBoolean(index, bVar53.f8547o0);
                    break;
                case 82:
                    c cVar5 = aVar.f8474d;
                    cVar5.f8564c = typedArray.getInteger(index, cVar5.f8564c);
                    break;
                case 83:
                    C0151e c0151e12 = aVar.f8476f;
                    c0151e12.f8590i = m(typedArray, index, c0151e12.f8590i);
                    break;
                case 84:
                    c cVar6 = aVar.f8474d;
                    cVar6.f8572k = typedArray.getInteger(index, cVar6.f8572k);
                    break;
                case 85:
                    c cVar7 = aVar.f8474d;
                    cVar7.f8571j = typedArray.getFloat(index, cVar7.f8571j);
                    break;
                case 86:
                    int i9 = typedArray.peekValue(index).type;
                    if (i9 == 1) {
                        aVar.f8474d.f8575n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f8474d;
                        if (cVar8.f8575n != -1) {
                            cVar8.f8574m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i9 == 3) {
                        aVar.f8474d.f8573l = typedArray.getString(index);
                        if (aVar.f8474d.f8573l.indexOf("/") > 0) {
                            aVar.f8474d.f8575n = typedArray.getResourceId(index, -1);
                            aVar.f8474d.f8574m = -2;
                            break;
                        } else {
                            aVar.f8474d.f8574m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f8474d;
                        cVar9.f8574m = typedArray.getInteger(index, cVar9.f8575n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8463h.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8463h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f8475e;
                    bVar54.f8553s = m(typedArray, index, bVar54.f8553s);
                    break;
                case 92:
                    b bVar55 = aVar.f8475e;
                    bVar55.f8554t = m(typedArray, index, bVar55.f8554t);
                    break;
                case 93:
                    b bVar56 = aVar.f8475e;
                    bVar56.f8505N = typedArray.getDimensionPixelSize(index, bVar56.f8505N);
                    break;
                case 94:
                    b bVar57 = aVar.f8475e;
                    bVar57.f8512U = typedArray.getDimensionPixelSize(index, bVar57.f8512U);
                    break;
                case 95:
                    n(aVar.f8475e, typedArray, index, 0);
                    break;
                case 96:
                    n(aVar.f8475e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f8475e;
                    bVar58.f8551q0 = typedArray.getInt(index, bVar58.f8551q0);
                    break;
            }
        }
        b bVar59 = aVar.f8475e;
        if (bVar59.f8541l0 != null) {
            bVar59.f8539k0 = null;
        }
    }

    private static void r(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0150a c0150a = new a.C0150a();
        aVar.f8478h = c0150a;
        aVar.f8474d.f8562a = false;
        aVar.f8475e.f8520b = false;
        aVar.f8473c.f8576a = false;
        aVar.f8476f.f8582a = false;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArray.getIndex(i8);
            switch (f8464i.get(index)) {
                case 2:
                    c0150a.b(2, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8502K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f8463h.get(index));
                    break;
                case 5:
                    c0150a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0150a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f8475e.f8496E));
                    break;
                case 7:
                    c0150a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f8475e.f8497F));
                    break;
                case 8:
                    c0150a.b(8, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8503L));
                    break;
                case 11:
                    c0150a.b(11, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8509R));
                    break;
                case 12:
                    c0150a.b(12, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8510S));
                    break;
                case 13:
                    c0150a.b(13, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8506O));
                    break;
                case 14:
                    c0150a.b(14, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8508Q));
                    break;
                case 15:
                    c0150a.b(15, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8511T));
                    break;
                case 16:
                    c0150a.b(16, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8507P));
                    break;
                case 17:
                    c0150a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f8475e.f8528f));
                    break;
                case 18:
                    c0150a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f8475e.f8530g));
                    break;
                case 19:
                    c0150a.a(19, typedArray.getFloat(index, aVar.f8475e.f8532h));
                    break;
                case 20:
                    c0150a.a(20, typedArray.getFloat(index, aVar.f8475e.f8559y));
                    break;
                case C1445Je.zzm /* 21 */:
                    c0150a.b(21, typedArray.getLayoutDimension(index, aVar.f8475e.f8526e));
                    break;
                case 22:
                    c0150a.b(22, f8462g[typedArray.getInt(index, aVar.f8473c.f8577b)]);
                    break;
                case 23:
                    c0150a.b(23, typedArray.getLayoutDimension(index, aVar.f8475e.f8524d));
                    break;
                case 24:
                    c0150a.b(24, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8499H));
                    break;
                case 27:
                    c0150a.b(27, typedArray.getInt(index, aVar.f8475e.f8498G));
                    break;
                case 28:
                    c0150a.b(28, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8500I));
                    break;
                case 31:
                    c0150a.b(31, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8504M));
                    break;
                case 34:
                    c0150a.b(34, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8501J));
                    break;
                case 37:
                    c0150a.a(37, typedArray.getFloat(index, aVar.f8475e.f8560z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f8471a);
                    aVar.f8471a = resourceId;
                    c0150a.b(38, resourceId);
                    break;
                case 39:
                    c0150a.a(39, typedArray.getFloat(index, aVar.f8475e.f8514W));
                    break;
                case 40:
                    c0150a.a(40, typedArray.getFloat(index, aVar.f8475e.f8513V));
                    break;
                case 41:
                    c0150a.b(41, typedArray.getInt(index, aVar.f8475e.f8515X));
                    break;
                case 42:
                    c0150a.b(42, typedArray.getInt(index, aVar.f8475e.f8516Y));
                    break;
                case 43:
                    c0150a.a(43, typedArray.getFloat(index, aVar.f8473c.f8579d));
                    break;
                case 44:
                    c0150a.d(44, true);
                    c0150a.a(44, typedArray.getDimension(index, aVar.f8476f.f8595n));
                    break;
                case 45:
                    c0150a.a(45, typedArray.getFloat(index, aVar.f8476f.f8584c));
                    break;
                case 46:
                    c0150a.a(46, typedArray.getFloat(index, aVar.f8476f.f8585d));
                    break;
                case 47:
                    c0150a.a(47, typedArray.getFloat(index, aVar.f8476f.f8586e));
                    break;
                case 48:
                    c0150a.a(48, typedArray.getFloat(index, aVar.f8476f.f8587f));
                    break;
                case 49:
                    c0150a.a(49, typedArray.getDimension(index, aVar.f8476f.f8588g));
                    break;
                case 50:
                    c0150a.a(50, typedArray.getDimension(index, aVar.f8476f.f8589h));
                    break;
                case 51:
                    c0150a.a(51, typedArray.getDimension(index, aVar.f8476f.f8591j));
                    break;
                case 52:
                    c0150a.a(52, typedArray.getDimension(index, aVar.f8476f.f8592k));
                    break;
                case 53:
                    c0150a.a(53, typedArray.getDimension(index, aVar.f8476f.f8593l));
                    break;
                case 54:
                    c0150a.b(54, typedArray.getInt(index, aVar.f8475e.f8517Z));
                    break;
                case 55:
                    c0150a.b(55, typedArray.getInt(index, aVar.f8475e.f8519a0));
                    break;
                case 56:
                    c0150a.b(56, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8521b0));
                    break;
                case 57:
                    c0150a.b(57, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8523c0));
                    break;
                case 58:
                    c0150a.b(58, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8525d0));
                    break;
                case 59:
                    c0150a.b(59, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8527e0));
                    break;
                case 60:
                    c0150a.a(60, typedArray.getFloat(index, aVar.f8476f.f8583b));
                    break;
                case 62:
                    c0150a.b(62, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8494C));
                    break;
                case 63:
                    c0150a.a(63, typedArray.getFloat(index, aVar.f8475e.f8495D));
                    break;
                case 64:
                    c0150a.b(64, m(typedArray, index, aVar.f8474d.f8563b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0150a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0150a.c(65, C5822a.f36182c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0150a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0150a.a(67, typedArray.getFloat(index, aVar.f8474d.f8570i));
                    break;
                case 68:
                    c0150a.a(68, typedArray.getFloat(index, aVar.f8473c.f8580e));
                    break;
                case 69:
                    c0150a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0150a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0150a.b(72, typedArray.getInt(index, aVar.f8475e.f8533h0));
                    break;
                case 73:
                    c0150a.b(73, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8535i0));
                    break;
                case 74:
                    c0150a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0150a.d(75, typedArray.getBoolean(index, aVar.f8475e.f8549p0));
                    break;
                case 76:
                    c0150a.b(76, typedArray.getInt(index, aVar.f8474d.f8566e));
                    break;
                case 77:
                    c0150a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0150a.b(78, typedArray.getInt(index, aVar.f8473c.f8578c));
                    break;
                case 79:
                    c0150a.a(79, typedArray.getFloat(index, aVar.f8474d.f8568g));
                    break;
                case 80:
                    c0150a.d(80, typedArray.getBoolean(index, aVar.f8475e.f8545n0));
                    break;
                case 81:
                    c0150a.d(81, typedArray.getBoolean(index, aVar.f8475e.f8547o0));
                    break;
                case 82:
                    c0150a.b(82, typedArray.getInteger(index, aVar.f8474d.f8564c));
                    break;
                case 83:
                    c0150a.b(83, m(typedArray, index, aVar.f8476f.f8590i));
                    break;
                case 84:
                    c0150a.b(84, typedArray.getInteger(index, aVar.f8474d.f8572k));
                    break;
                case 85:
                    c0150a.a(85, typedArray.getFloat(index, aVar.f8474d.f8571j));
                    break;
                case 86:
                    int i9 = typedArray.peekValue(index).type;
                    if (i9 == 1) {
                        aVar.f8474d.f8575n = typedArray.getResourceId(index, -1);
                        c0150a.b(89, aVar.f8474d.f8575n);
                        c cVar = aVar.f8474d;
                        if (cVar.f8575n != -1) {
                            cVar.f8574m = -2;
                            c0150a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i9 == 3) {
                        aVar.f8474d.f8573l = typedArray.getString(index);
                        c0150a.c(90, aVar.f8474d.f8573l);
                        if (aVar.f8474d.f8573l.indexOf("/") > 0) {
                            aVar.f8474d.f8575n = typedArray.getResourceId(index, -1);
                            c0150a.b(89, aVar.f8474d.f8575n);
                            aVar.f8474d.f8574m = -2;
                            c0150a.b(88, -2);
                            break;
                        } else {
                            aVar.f8474d.f8574m = -1;
                            c0150a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f8474d;
                        cVar2.f8574m = typedArray.getInteger(index, cVar2.f8575n);
                        c0150a.b(88, aVar.f8474d.f8574m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f8463h.get(index));
                    break;
                case 93:
                    c0150a.b(93, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8505N));
                    break;
                case 94:
                    c0150a.b(94, typedArray.getDimensionPixelSize(index, aVar.f8475e.f8512U));
                    break;
                case 95:
                    n(c0150a, typedArray, index, 0);
                    break;
                case 96:
                    n(c0150a, typedArray, index, 1);
                    break;
                case 97:
                    c0150a.b(97, typedArray.getInt(index, aVar.f8475e.f8551q0));
                    break;
                case 98:
                    if (AbstractC6166b.f38776Q) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f8471a);
                        aVar.f8471a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f8472b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f8472b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f8471a = typedArray.getResourceId(index, aVar.f8471a);
                        break;
                    }
                case 99:
                    c0150a.d(99, typedArray.getBoolean(index, aVar.f8475e.f8534i));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z7) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f8470f.keySet());
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            int id = childAt.getId();
            if (!this.f8470f.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC6165a.a(childAt));
            } else {
                if (this.f8469e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f8470f.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f8470f.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.f8475e.f8537j0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id);
                                aVar2.setType(aVar.f8475e.f8533h0);
                                aVar2.setMargin(aVar.f8475e.f8535i0);
                                aVar2.setAllowsGoneWidget(aVar.f8475e.f8549p0);
                                b bVar = aVar.f8475e;
                                int[] iArr = bVar.f8539k0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f8541l0;
                                    if (str != null) {
                                        bVar.f8539k0 = h(aVar2, str);
                                        aVar2.setReferencedIds(aVar.f8475e.f8539k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.b(bVar2);
                            if (z7) {
                                androidx.constraintlayout.widget.b.c(childAt, aVar.f8477g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.f8473c;
                            if (dVar.f8578c == 0) {
                                childAt.setVisibility(dVar.f8577b);
                            }
                            childAt.setAlpha(aVar.f8473c.f8579d);
                            childAt.setRotation(aVar.f8476f.f8583b);
                            childAt.setRotationX(aVar.f8476f.f8584c);
                            childAt.setRotationY(aVar.f8476f.f8585d);
                            childAt.setScaleX(aVar.f8476f.f8586e);
                            childAt.setScaleY(aVar.f8476f.f8587f);
                            C0151e c0151e = aVar.f8476f;
                            if (c0151e.f8590i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f8476f.f8590i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0151e.f8588g)) {
                                    childAt.setPivotX(aVar.f8476f.f8588g);
                                }
                                if (!Float.isNaN(aVar.f8476f.f8589h)) {
                                    childAt.setPivotY(aVar.f8476f.f8589h);
                                }
                            }
                            childAt.setTranslationX(aVar.f8476f.f8591j);
                            childAt.setTranslationY(aVar.f8476f.f8592k);
                            childAt.setTranslationZ(aVar.f8476f.f8593l);
                            C0151e c0151e2 = aVar.f8476f;
                            if (c0151e2.f8594m) {
                                childAt.setElevation(c0151e2.f8595n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = (a) this.f8470f.get(num);
            if (aVar3 != null) {
                if (aVar3.f8475e.f8537j0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.f8475e;
                    int[] iArr2 = bVar3.f8539k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f8541l0;
                        if (str2 != null) {
                            bVar3.f8539k0 = h(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.f8475e.f8539k0);
                        }
                    }
                    aVar4.setType(aVar3.f8475e.f8533h0);
                    aVar4.setMargin(aVar3.f8475e.f8535i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.o();
                    aVar3.b(generateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, generateDefaultLayoutParams);
                }
                if (aVar3.f8475e.f8518a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.b(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = constraintLayout.getChildAt(i9);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(Context context, int i8) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i8, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f8470f.clear();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f8469e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8470f.containsKey(Integer.valueOf(id))) {
                this.f8470f.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f8470f.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.f8477g = androidx.constraintlayout.widget.b.a(this.f8468d, childAt);
                aVar.d(id, bVar);
                aVar.f8473c.f8577b = childAt.getVisibility();
                aVar.f8473c.f8579d = childAt.getAlpha();
                aVar.f8476f.f8583b = childAt.getRotation();
                aVar.f8476f.f8584c = childAt.getRotationX();
                aVar.f8476f.f8585d = childAt.getRotationY();
                aVar.f8476f.f8586e = childAt.getScaleX();
                aVar.f8476f.f8587f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C0151e c0151e = aVar.f8476f;
                    c0151e.f8588g = pivotX;
                    c0151e.f8589h = pivotY;
                }
                aVar.f8476f.f8591j = childAt.getTranslationX();
                aVar.f8476f.f8592k = childAt.getTranslationY();
                aVar.f8476f.f8593l = childAt.getTranslationZ();
                C0151e c0151e2 = aVar.f8476f;
                if (c0151e2.f8594m) {
                    c0151e2.f8595n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.f8475e.f8549p0 = aVar2.getAllowsGoneWidget();
                    aVar.f8475e.f8539k0 = aVar2.getReferencedIds();
                    aVar.f8475e.f8533h0 = aVar2.getType();
                    aVar.f8475e.f8535i0 = aVar2.getMargin();
                }
            }
        }
    }

    public void g(int i8, int i9, int i10, float f8) {
        b bVar = j(i8).f8475e;
        bVar.f8493B = i9;
        bVar.f8494C = i10;
        bVar.f8495D = f8;
    }

    public void k(Context context, int i8) {
        XmlResourceParser xml = context.getResources().getXml(i8);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a i9 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i9.f8475e.f8518a = true;
                    }
                    this.f8470f.put(Integer.valueOf(i9.f8471a), i9);
                }
            }
        } catch (IOException e8) {
            Log.e("ConstraintSet", "Error parsing resource: " + i8, e8);
        } catch (XmlPullParserException e9) {
            Log.e("ConstraintSet", "Error parsing resource: " + i8, e9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d3, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.e.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
