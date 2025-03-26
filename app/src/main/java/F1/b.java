package F1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import v2.InterfaceC6834a;

/* loaded from: classes.dex */
class b extends F1.a {

    /* renamed from: a, reason: collision with root package name */
    private int f2230a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Context f2231b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6834a f2232c;

    /* renamed from: d, reason: collision with root package name */
    private ServiceConnection f2233d;

    /* renamed from: F1.b$b, reason: collision with other inner class name */
    private final class ServiceConnectionC0036b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final c f2234a;

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            G1.a.a("InstallReferrerClient", "Install Referrer service connected.");
            b.this.f2232c = InterfaceC6834a.AbstractBinderC0337a.w0(iBinder);
            b.this.f2230a = 2;
            this.f2234a.a(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            G1.a.b("InstallReferrerClient", "Install Referrer service disconnected.");
            b.this.f2232c = null;
            b.this.f2230a = 0;
            this.f2234a.b();
        }

        private ServiceConnectionC0036b(c cVar) {
            if (cVar == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f2234a = cVar;
        }
    }

    public b(Context context) {
        this.f2231b = context.getApplicationContext();
    }

    private boolean g() {
        return this.f2231b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
    }

    @Override // F1.a
    public void a() {
        this.f2230a = 3;
        if (this.f2233d != null) {
            G1.a.a("InstallReferrerClient", "Unbinding from service.");
            this.f2231b.unbindService(this.f2233d);
            this.f2233d = null;
        }
        this.f2232c = null;
    }

    @Override // F1.a
    public d b() {
        if (!h()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f2231b.getPackageName());
        try {
            return new d(this.f2232c.P2(bundle));
        } catch (RemoteException e8) {
            G1.a.b("InstallReferrerClient", "RemoteException getting install referrer information");
            this.f2230a = 0;
            throw e8;
        }
    }

    @Override // F1.a
    public void d(c cVar) {
        ServiceInfo serviceInfo;
        if (h()) {
            G1.a.a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            cVar.a(0);
            return;
        }
        int i8 = this.f2230a;
        if (i8 == 1) {
            G1.a.b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            cVar.a(3);
            return;
        }
        if (i8 == 3) {
            G1.a.b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            cVar.a(3);
            return;
        }
        G1.a.a("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> queryIntentServices = this.f2231b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
            this.f2230a = 0;
            G1.a.a("InstallReferrerClient", "Install Referrer service unavailable on device.");
            cVar.a(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if (!"com.android.vending".equals(str) || str2 == null || !g()) {
            G1.a.b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.f2230a = 0;
            cVar.a(2);
            return;
        }
        Intent intent2 = new Intent(intent);
        ServiceConnectionC0036b serviceConnectionC0036b = new ServiceConnectionC0036b(cVar);
        this.f2233d = serviceConnectionC0036b;
        try {
            if (this.f2231b.bindService(intent2, serviceConnectionC0036b, 1)) {
                G1.a.a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            G1.a.b("InstallReferrerClient", "Connection to service is blocked.");
            this.f2230a = 0;
            cVar.a(1);
        } catch (SecurityException unused) {
            G1.a.b("InstallReferrerClient", "No permission to connect to service.");
            this.f2230a = 0;
            cVar.a(4);
        }
    }

    public boolean h() {
        return (this.f2230a != 2 || this.f2232c == null || this.f2233d == null) ? false : true;
    }
}
