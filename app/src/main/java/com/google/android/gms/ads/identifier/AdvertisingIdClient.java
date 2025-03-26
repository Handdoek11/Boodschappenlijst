package com.google.android.gms.ads.identifier;

import Z2.r;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C1109h;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.ServiceConnectionC1088a;
import com.google.android.gms.common.util.VisibleForTesting;
import e3.C5745b;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k3.e;
import k3.f;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    ServiceConnectionC1088a zza;
    f zzb;
    boolean zzc;
    final Object zzd;
    b zze;
    final long zzf;
    private final Context zzg;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z7) {
            this.zza = str;
            this.zzb = z7;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z7 = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z7);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean d8;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            r.k("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            b bVar = advertisingIdClient.zze;
                            if (bVar == null || !bVar.f13065u) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e8) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                        }
                    }
                    r.l(advertisingIdClient.zza);
                    r.l(advertisingIdClient.zzb);
                    try {
                        d8 = advertisingIdClient.zzb.d();
                    } catch (RemoteException e9) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            return d8;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z7) {
    }

    private final Info zzd(int i8) {
        Info info;
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        b bVar = this.zze;
                        if (bVar == null || !bVar.f13065u) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e8) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e8);
                    }
                }
                r.l(this.zza);
                r.l(this.zzb);
                try {
                    info = new Info(this.zzb.a(), this.zzb.H1(true));
                } catch (RemoteException e9) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            b bVar = this.zze;
            if (bVar != null) {
                bVar.f13064t.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j8 = this.zzf;
            if (j8 > 0) {
                this.zze = new b(this, j8);
            }
        }
    }

    protected final void finalize() {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return zzd(-1);
    }

    public void start() {
        zzb(true);
    }

    public final void zza() {
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        C5745b.b().c(this.zzg, this.zza);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    protected final void zzb(boolean z7) {
        r.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int h8 = C1109h.f().h(context, 12451000);
                    if (h8 != 0 && h8 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC1088a serviceConnectionC1088a = new ServiceConnectionC1088a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C5745b.b().a(context, intent, serviceConnectionC1088a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = serviceConnectionC1088a;
                        try {
                            this.zzb = e.w0(serviceConnectionC1088a.a(10000L, TimeUnit.MILLISECONDS));
                            this.zzc = true;
                            if (z7) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    final boolean zzc(Info info, boolean z7, float f8, long j8, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", "1");
        if (info != null) {
            hashMap.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                hashMap.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j8));
        new a(this, hashMap).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(Context context, long j8, boolean z7, boolean z8) {
        Context applicationContext;
        this.zzd = new Object();
        r.l(context);
        if (z7 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j8;
    }
}
