package com.google.android.gms.common;

import G2.L0;
import X2.InterfaceC0759g;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.k;
import androidx.fragment.app.AbstractActivityC0911j;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1108g extends C1109h {

    /* renamed from: c, reason: collision with root package name */
    private String f13413c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f13411e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final C1108g f13412f = new C1108g();

    /* renamed from: d, reason: collision with root package name */
    public static final int f13410d = C1109h.f13414a;

    public static C1108g m() {
        return f13412f;
    }

    @Override // com.google.android.gms.common.C1109h
    public Intent b(Context context, int i8, String str) {
        return super.b(context, i8, str);
    }

    @Override // com.google.android.gms.common.C1109h
    public PendingIntent c(Context context, int i8, int i9) {
        return super.c(context, i8, i9);
    }

    @Override // com.google.android.gms.common.C1109h
    public final String e(int i8) {
        return super.e(i8);
    }

    @Override // com.google.android.gms.common.C1109h
    public int g(Context context) {
        return super.g(context);
    }

    @Override // com.google.android.gms.common.C1109h
    public int h(Context context, int i8) {
        return super.h(context, i8);
    }

    @Override // com.google.android.gms.common.C1109h
    public final boolean j(int i8) {
        return super.j(i8);
    }

    public Dialog k(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, i8, Z2.G.b(activity, b(activity, i8, "d"), i9), onCancelListener, null);
    }

    public PendingIntent l(Context context, C1103b c1103b) {
        return c1103b.D0() ? c1103b.C0() : c(context, c1103b.A0(), 0);
    }

    public boolean n(Activity activity, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k8 = k(activity, i8, i9, onCancelListener);
        if (k8 == null) {
            return false;
        }
        s(activity, k8, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public void o(Context context, int i8) {
        t(context, i8, null, d(context, i8, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final Dialog p(Context context, int i8, Z2.G g8, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        if (i8 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(Z2.C.c(context, i8));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b8 = Z2.C.b(context, i8);
        if (b8 != null) {
            if (g8 == null) {
                g8 = onClickListener;
            }
            builder.setPositiveButton(b8, g8);
        }
        String f8 = Z2.C.f(context, i8);
        if (f8 != null) {
            builder.setTitle(f8);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i8)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(Z2.C.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final X2.r r(Context context, X2.q qVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        X2.r rVar = new X2.r(qVar);
        m3.f.p(context, rVar, intentFilter);
        rVar.a(context);
        if (i(context, "com.google.android.gms")) {
            return rVar;
        }
        qVar.a();
        rVar.b();
        return null;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC0911j) {
                l.s2(dialog, onCancelListener).r2(((AbstractActivityC0911j) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC1104c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void t(Context context, int i8, String str, PendingIntent pendingIntent) {
        int i9;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i8), null), new IllegalArgumentException());
        if (i8 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (i8 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String e8 = Z2.C.e(context, i8);
        String d8 = Z2.C.d(context, i8);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Z2.r.l(context.getSystemService("notification"));
        k.e v7 = new k.e(context).p(true).e(true).j(e8).v(new k.c().h(d8));
        if (f3.i.f(context)) {
            Z2.r.p(f3.m.e());
            v7.t(context.getApplicationInfo().icon).r(2);
            if (f3.i.g(context)) {
                v7.a(U2.a.f5334a, resources.getString(U2.b.f5349o), pendingIntent);
            } else {
                v7.h(pendingIntent);
            }
        } else {
            v7.t(R.drawable.stat_sys_warning).w(resources.getString(U2.b.f5342h)).z(System.currentTimeMillis()).h(pendingIntent).i(d8);
        }
        if (f3.m.i()) {
            Z2.r.p(f3.m.i());
            synchronized (f13411e) {
                str2 = this.f13413c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(U2.b.f5341g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(L0.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            v7.f(str2);
        }
        Notification b8 = v7.b();
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            AbstractC1110i.sCanceledAvailabilityNotification.set(false);
            i9 = 10436;
        } else {
            i9 = 39789;
        }
        notificationManager.notify(i9, b8);
    }

    final void u(Context context) {
        new m(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, InterfaceC0759g interfaceC0759g, int i8, int i9, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p8 = p(activity, i8, Z2.G.d(interfaceC0759g, b(activity, i8, "d"), 2), onCancelListener, null);
        if (p8 == null) {
            return false;
        }
        s(activity, p8, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean w(Context context, C1103b c1103b, int i8) {
        PendingIntent l8;
        if (h3.b.a(context) || (l8 = l(context, c1103b)) == null) {
            return false;
        }
        t(context, c1103b.A0(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, l8, i8, true), m3.g.f38964a | 134217728));
        return true;
    }
}
