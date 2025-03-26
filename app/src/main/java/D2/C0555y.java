package D2;

import com.google.android.gms.internal.ads.C1870Vh;
import com.google.android.gms.internal.ads.C1905Wh;
import com.google.android.gms.internal.ads.C3858qp;
import com.google.android.gms.internal.ads.C3962rn;
import java.util.Random;

/* renamed from: D2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555y {

    /* renamed from: f, reason: collision with root package name */
    private static final C0555y f1363f = new C0555y();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1364g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final H2.g f1365a;

    /* renamed from: b, reason: collision with root package name */
    private final C0549w f1366b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1367c;

    /* renamed from: d, reason: collision with root package name */
    private final H2.a f1368d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f1369e;

    protected C0555y() {
        H2.g gVar = new H2.g();
        C0549w c0549w = new C0549w(new V1(), new T1(), new C0548v1(), new C1870Vh(), new C3858qp(), new C3962rn(), new C1905Wh(), new W1());
        String i8 = H2.g.i();
        H2.a aVar = new H2.a(0, 244410000, true);
        Random random = new Random();
        this.f1365a = gVar;
        this.f1366b = c0549w;
        this.f1367c = i8;
        this.f1368d = aVar;
        this.f1369e = random;
    }

    public static C0549w a() {
        return f1363f.f1366b;
    }

    public static H2.g b() {
        return f1363f.f1365a;
    }

    public static H2.a c() {
        return f1363f.f1368d;
    }

    public static String d() {
        return f1363f.f1367c;
    }

    public static Random e() {
        return f1363f.f1369e;
    }
}
