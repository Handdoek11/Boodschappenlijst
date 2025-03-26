package y1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import s1.j;
import u0.AbstractC6809a;
import w1.C6866b;

/* renamed from: y1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6942f extends AbstractC6940d {

    /* renamed from: j, reason: collision with root package name */
    static final String f44543j = j.f("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    private final ConnectivityManager f44544g;

    /* renamed from: h, reason: collision with root package name */
    private b f44545h;

    /* renamed from: i, reason: collision with root package name */
    private a f44546i;

    /* renamed from: y1.f$a */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            j.c().a(C6942f.f44543j, "Network broadcast received", new Throwable[0]);
            C6942f c6942f = C6942f.this;
            c6942f.d(c6942f.g());
        }
    }

    /* renamed from: y1.f$b */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            j.c().a(C6942f.f44543j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            C6942f c6942f = C6942f.this;
            c6942f.d(c6942f.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.c().a(C6942f.f44543j, "Network connection lost", new Throwable[0]);
            C6942f c6942f = C6942f.this;
            c6942f.d(c6942f.g());
        }
    }

    public C6942f(Context context, C1.a aVar) {
        super(context, aVar);
        this.f44544g = (ConnectivityManager) this.f44537b.getSystemService("connectivity");
        if (j()) {
            this.f44545h = new b();
        } else {
            this.f44546i = new a();
        }
    }

    private static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // y1.AbstractC6940d
    public void e() {
        if (!j()) {
            j.c().a(f44543j, "Registering broadcast receiver", new Throwable[0]);
            this.f44537b.registerReceiver(this.f44546i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            j.c().a(f44543j, "Registering network callback", new Throwable[0]);
            this.f44544g.registerDefaultNetworkCallback(this.f44545h);
        } catch (IllegalArgumentException | SecurityException e8) {
            j.c().b(f44543j, "Received exception while registering network callback", e8);
        }
    }

    @Override // y1.AbstractC6940d
    public void f() {
        if (!j()) {
            j.c().a(f44543j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f44537b.unregisterReceiver(this.f44546i);
            return;
        }
        try {
            j.c().a(f44543j, "Unregistering network callback", new Throwable[0]);
            this.f44544g.unregisterNetworkCallback(this.f44545h);
        } catch (IllegalArgumentException | SecurityException e8) {
            j.c().b(f44543j, "Received exception while unregistering network callback", e8);
        }
    }

    C6866b g() {
        NetworkInfo activeNetworkInfo = this.f44544g.getActiveNetworkInfo();
        boolean z7 = false;
        boolean z8 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i8 = i();
        boolean a8 = AbstractC6809a.a(this.f44544g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z7 = true;
        }
        return new C6866b(z8, i8, a8, z7);
    }

    @Override // y1.AbstractC6940d
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6866b b() {
        return g();
    }

    boolean i() {
        try {
            NetworkCapabilities networkCapabilities = this.f44544g.getNetworkCapabilities(this.f44544g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e8) {
            j.c().b(f44543j, "Unable to validate active network", e8);
            return false;
        }
    }
}
