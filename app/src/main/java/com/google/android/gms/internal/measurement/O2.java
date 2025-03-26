package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public final class O2 implements Q2 {
    @Override // com.google.android.gms.internal.measurement.Q2
    public final String a(ContentResolver contentResolver, String str) {
        Uri uri = I2.f28890a;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                throw new zzgt("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (query == null) {
                        throw new zzgt("ContentProvider query returned null cursor");
                    }
                    if (query.moveToFirst()) {
                        String string = query.getString(1);
                        query.close();
                        return string;
                    }
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return null;
                } catch (Throwable th) {
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e8) {
                throw new zzgt("ContentProvider query failed", e8);
            }
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q2
    public final Map b(ContentResolver contentResolver, String[] strArr, R2 r22) {
        Uri uri = I2.f28891b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient == null) {
            throw new zzgt("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (query == null) {
                        throw new zzgt("ContentProvider query returned null cursor");
                    }
                    Map m8 = r22.m(query.getCount());
                    while (query.moveToNext()) {
                        m8.put(query.getString(0), query.getString(1));
                    }
                    if (!query.isAfterLast()) {
                        throw new zzgt("Cursor read incomplete (ContentProvider dead?)");
                    }
                    query.close();
                    return m8;
                } catch (Throwable th) {
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (RemoteException e8) {
                throw new zzgt("ContentProvider query failed", e8);
            }
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }
}
