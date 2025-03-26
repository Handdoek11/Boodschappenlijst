package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
class H {

    /* renamed from: d, reason: collision with root package name */
    private static H f6802d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6803a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f6804b;

    /* renamed from: c, reason: collision with root package name */
    private final a f6805c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f6806a;

        /* renamed from: b, reason: collision with root package name */
        long f6807b;

        a() {
        }
    }

    H(Context context, LocationManager locationManager) {
        this.f6803a = context;
        this.f6804b = locationManager;
    }

    static H a(Context context) {
        if (f6802d == null) {
            Context applicationContext = context.getApplicationContext();
            f6802d = new H(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f6802d;
    }

    private Location b() {
        Location c8 = o0.d.b(this.f6803a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c9 = o0.d.b(this.f6803a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c9 == null || c8 == null) ? c9 != null ? c9 : c8 : c9.getTime() > c8.getTime() ? c9 : c8;
    }

    private Location c(String str) {
        try {
            if (this.f6804b.isProviderEnabled(str)) {
                return this.f6804b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e8) {
            Log.d("TwilightManager", "Failed to get last known location", e8);
            return null;
        }
    }

    private boolean e() {
        return this.f6805c.f6807b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j8;
        a aVar = this.f6805c;
        long currentTimeMillis = System.currentTimeMillis();
        G b8 = G.b();
        b8.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b8.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z7 = b8.f6801c == 1;
        long j9 = b8.f6800b;
        long j10 = b8.f6799a;
        b8.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b8.f6800b;
        if (j9 == -1 || j10 == -1) {
            j8 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis <= j10) {
                j11 = currentTimeMillis > j9 ? j10 : j9;
            }
            j8 = j11 + 60000;
        }
        aVar.f6806a = z7;
        aVar.f6807b = j8;
    }

    boolean d() {
        a aVar = this.f6805c;
        if (e()) {
            return aVar.f6806a;
        }
        Location b8 = b();
        if (b8 != null) {
            f(b8);
            return aVar.f6806a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i8 = Calendar.getInstance().get(11);
        return i8 < 6 || i8 >= 22;
    }
}
