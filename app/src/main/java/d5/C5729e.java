package d5;

import A3.AbstractC0376j;
import A3.AbstractC0379m;
import A3.C0368b;
import A3.C0377k;
import A3.InterfaceC0371e;
import A3.InterfaceC0375i;
import Y4.i;
import Z2.r;
import a5.C0823a;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import c3.AbstractC0981c;
import c3.C0980b;
import c5.C1018b;
import c5.InterfaceC1017a;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.C1109h;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.codescanner.internal.GmsBarcodeScanningDelegateActivity;
import java.util.concurrent.atomic.AtomicReference;
import q3.AbstractC6633z6;
import q3.C6538n6;
import q3.C6544o4;
import q3.C6562q6;
import q3.C6569r6;
import q3.EnumC6528m4;
import q3.EnumC6536n4;
import q3.F3;

/* renamed from: d5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5729e implements InterfaceC1017a {

    /* renamed from: e, reason: collision with root package name */
    static final AtomicReference f35274e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f35275f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static boolean f35276g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f35277a;

    /* renamed from: b, reason: collision with root package name */
    private final C1018b f35278b;

    /* renamed from: c, reason: collision with root package name */
    private final C6538n6 f35279c;

    /* renamed from: d, reason: collision with root package name */
    private final C6562q6 f35280d;

    public C5729e(Context context, C1018b c1018b) {
        C6562q6 a8 = C6562q6.a(context);
        this.f35279c = AbstractC6633z6.b("play-services-code-scanner");
        this.f35277a = context;
        this.f35278b = c1018b;
        this.f35280d = a8;
    }

    static void e(C0823a c0823a, int i8) {
        Pair pair = (Pair) f35274e.getAndSet(null);
        if (pair == null) {
            Log.e("GmsBarcodeScannerImpl", "Scanning task source doesn't exist when setting back result.");
            return;
        }
        if (c0823a != null) {
            ((C0377k) pair.first).c(c0823a);
        } else if (i8 == 201) {
            ((C0368b) pair.second).a();
        } else {
            ((C0377k) pair.first).b(new MlKitException("Failed to scan code.", i8));
        }
    }

    @Override // W2.c
    public final C1105d[] a() {
        return new C1105d[]{i.f6098o};
    }

    @Override // c5.InterfaceC1017a
    public final AbstractC0376j b() {
        if (C1109h.f().a(this.f35277a) >= 221500000) {
            return AbstractC0981c.b(this.f35277a).e(new W2.c() { // from class: d5.c
                @Override // W2.c
                public final C1105d[] a() {
                    AtomicReference atomicReference = C5729e.f35274e;
                    return new C1105d[]{i.f6085b};
                }
            }).t(new InterfaceC0375i() { // from class: d5.d
                @Override // A3.InterfaceC0375i
                public final AbstractC0376j a(Object obj) {
                    return this.f35273a.c((C0980b) obj);
                }
            });
        }
        d(207, SystemClock.elapsedRealtime(), System.currentTimeMillis());
        return AbstractC0379m.d(new MlKitException("Code scanner module is not supported on current Google Play Services version, please upgrade.", 207));
    }

    final /* synthetic */ AbstractC0376j c(C0980b c0980b) {
        AbstractC0376j c8;
        boolean z7 = false;
        if (c0980b.A0()) {
            if (new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_BARCODE").resolveActivity(this.f35277a.getApplicationContext().getPackageManager()) != null) {
                z7 = true;
            }
        }
        synchronized (f35275f) {
            try {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final long currentTimeMillis = System.currentTimeMillis();
                if (z7) {
                    AtomicReference atomicReference = f35274e;
                    Pair pair = (Pair) atomicReference.getAndSet(null);
                    if (pair != null) {
                        ((C0368b) pair.second).a();
                    }
                    C0368b c0368b = new C0368b();
                    C0377k c0377k = new C0377k(c0368b.b());
                    atomicReference.set(new Pair(c0377k, c0368b));
                    Intent intent = new Intent(this.f35277a, (Class<?>) GmsBarcodeScanningDelegateActivity.class);
                    intent.putExtra("extra_supported_formats", this.f35278b.a());
                    intent.putExtra("extra_allow_manual_input", this.f35278b.c());
                    intent.putExtra("extra_enable_auto_zoom", this.f35278b.b());
                    intent.setFlags(268435456);
                    this.f35277a.startActivity(intent);
                    c8 = c0377k.a().c(new InterfaceC0371e() { // from class: d5.b
                        @Override // A3.InterfaceC0371e
                        public final void a(AbstractC0376j abstractC0376j) {
                            this.f35269a.d(abstractC0376j.q() ? 201 : !abstractC0376j.s() ? ((MlKitException) r.l((MlKitException) abstractC0376j.n())).a() : 0, elapsedRealtime, currentTimeMillis);
                        }
                    });
                } else {
                    if (!f35276g) {
                        i.a(this.f35277a, "barcode_ui");
                        f35276g = true;
                    }
                    d(200, elapsedRealtime, currentTimeMillis);
                    c8 = AbstractC0379m.d(new MlKitException("Waiting for the Barcode UI module to be downloaded.", 200));
                }
            } finally {
            }
        }
        return c8;
    }

    final void d(int i8, long j8, long j9) {
        EnumC6528m4 enumC6528m4;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        C6538n6 c6538n6 = this.f35279c;
        C6544o4 c6544o4 = new C6544o4();
        F3 f32 = new F3();
        f32.d(Integer.valueOf(this.f35278b.a()));
        f32.a(Boolean.valueOf(this.f35278b.c()));
        f32.b(Long.valueOf(elapsedRealtime - j8));
        if (i8 == 0) {
            enumC6528m4 = EnumC6528m4.NO_ERROR;
        } else if (i8 != 207) {
            switch (i8) {
                case 200:
                    enumC6528m4 = EnumC6528m4.CODE_SCANNER_UNAVAILABLE;
                    break;
                case 201:
                    enumC6528m4 = EnumC6528m4.CODE_SCANNER_CANCELLED;
                    break;
                case 202:
                    enumC6528m4 = EnumC6528m4.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED;
                    break;
                case 203:
                    enumC6528m4 = EnumC6528m4.CODE_SCANNER_APP_NAME_UNAVAILABLE;
                    break;
                case 204:
                    enumC6528m4 = EnumC6528m4.CODE_SCANNER_TASK_IN_PROGRESS;
                    break;
                case 205:
                    enumC6528m4 = EnumC6528m4.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
                    break;
                default:
                    enumC6528m4 = EnumC6528m4.UNKNOWN_ERROR;
                    break;
            }
        } else {
            enumC6528m4 = EnumC6528m4.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD;
        }
        f32.c(enumC6528m4);
        c6544o4.c(f32.e());
        c6538n6.c(C6569r6.e(c6544o4), EnumC6536n4.CODE_SCANNER_SCAN_API);
        this.f35280d.c(24323, i8, j9, currentTimeMillis);
    }
}
