package com.google.android.gms.ads.internal.offline.buffering;

import D2.C0555y;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.BinderC4830zl;
import com.google.android.gms.internal.ads.InterfaceC3418mn;

/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3418mn f13067x;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f13067x = C0555y.a().j(context, new BinderC4830zl());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.f13067x.e();
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
