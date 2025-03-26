package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class XX implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20064a;

    /* renamed from: b, reason: collision with root package name */
    public final D2.c2 f20065b;

    /* renamed from: c, reason: collision with root package name */
    public final List f20066c;

    public XX(Context context, D2.c2 c2Var, List list) {
        this.f20064a = context;
        this.f20065b = c2Var;
        this.f20066c = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        KB kb = (KB) obj;
        if (((Boolean) AbstractC3622og.f25250a.e()).booleanValue()) {
            Bundle bundle = new Bundle();
            C2.v.t();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f20064a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    str = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", str);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("width", this.f20065b.f1225v);
            bundle2.putInt("height", this.f20065b.f1222s);
            bundle.putBundle("size", bundle2);
            if (!this.f20066c.isEmpty()) {
                List list = this.f20066c;
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            kb.f16551a.putBundle("view_hierarchy", bundle);
        }
    }
}
