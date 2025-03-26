package q3;

import A3.InterfaceC0372f;
import Z2.AbstractC0783w;
import Z2.C0776o;
import Z2.C0782v;
import Z2.C0785y;
import Z2.InterfaceC0784x;
import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: q3.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6562q6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0784x f42230a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f42231b = new AtomicLong(-1);

    C6562q6(Context context, String str) {
        this.f42230a = AbstractC0783w.b(context, C0785y.a().b("mlkit:vision").a());
    }

    public static C6562q6 a(Context context) {
        return new C6562q6(context, "mlkit:vision");
    }

    final /* synthetic */ void b(long j8, Exception exc) {
        this.f42231b.set(j8);
    }

    public final synchronized void c(int i8, int i9, long j8, long j9) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f42231b.get() != -1 && elapsedRealtime - this.f42231b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f42230a.c(new C0782v(0, Arrays.asList(new C0776o(24323, i9, 0, j8, j9, null, null, 0)))).e(new InterfaceC0372f() { // from class: q3.o6
            @Override // A3.InterfaceC0372f
            public final void e(Exception exc) {
                this.f42190a.b(elapsedRealtime, exc);
            }
        });
    }
}
