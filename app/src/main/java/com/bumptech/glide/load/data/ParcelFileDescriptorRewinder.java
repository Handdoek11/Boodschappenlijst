package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements e {

    /* renamed from: a, reason: collision with root package name */
    private final InternalRewinder f12614a;

    private static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        private final ParcelFileDescriptor f12615a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f12615a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.f12615a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f12615a;
            } catch (ErrnoException e8) {
                throw new IOException(e8);
            }
        }
    }

    public static final class a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f12614a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() {
        return this.f12614a.rewind();
    }
}
