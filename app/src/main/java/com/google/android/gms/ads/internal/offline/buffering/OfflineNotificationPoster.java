package com.google.android.gms.ads.internal.offline.buffering;

import D2.C0555y;
import E2.a;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC4830zl;
import com.google.android.gms.internal.ads.InterfaceC3418mn;
import i3.BinderC5853b;

/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3418mn f13066x;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f13066x = C0555y.a().j(context, new BinderC4830zl());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.f13066x.q7(BinderC5853b.p2(getApplicationContext()), new a(getInputData().i("uri"), getInputData().i("gws_query_id"), getInputData().i("image_url")));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
