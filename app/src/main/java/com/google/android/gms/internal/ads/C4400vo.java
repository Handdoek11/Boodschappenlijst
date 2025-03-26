package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import a3.InterfaceC0815c;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4400vo extends AbstractC0813a {
    public static final Parcelable.Creator<C4400vo> CREATOR = new C4509wo();

    /* renamed from: o, reason: collision with root package name */
    ParcelFileDescriptor f27351o;

    /* renamed from: s, reason: collision with root package name */
    private Parcelable f27352s = null;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27353t = true;

    public C4400vo(ParcelFileDescriptor parcelFileDescriptor) {
        this.f27351o = parcelFileDescriptor;
    }

    public final InterfaceC0815c A0(Parcelable.Creator creator) {
        if (this.f27353t) {
            if (this.f27351o == null) {
                H2.p.d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.f27351o));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    f3.k.a(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.f27352s = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.f27353t = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e8) {
                    H2.p.e("Could not read from parcel file descriptor", e8);
                    f3.k.a(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                f3.k.a(dataInputStream);
                throw th2;
            }
        }
        return (InterfaceC0815c) this.f27352s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f27351o == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f27352s.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uo
                            @Override // java.lang.Runnable
                            public final void run() {
                                Parcelable.Creator<C4400vo> creator = C4400vo.CREATOR;
                                OutputStream outputStream = autoCloseOutputStream;
                                byte[] bArr = marshall;
                                DataOutputStream dataOutputStream = null;
                                try {
                                    try {
                                        DataOutputStream dataOutputStream2 = new DataOutputStream(outputStream);
                                        try {
                                            dataOutputStream2.writeInt(bArr.length);
                                            dataOutputStream2.write(bArr);
                                            f3.k.a(dataOutputStream2);
                                        } catch (IOException e8) {
                                            e = e8;
                                            dataOutputStream = dataOutputStream2;
                                            H2.p.e("Error transporting the ad response", e);
                                            C2.v.s().x(e, "LargeParcelTeleporter.pipeData.1");
                                            if (dataOutputStream == null) {
                                                f3.k.a(outputStream);
                                            } else {
                                                f3.k.a(dataOutputStream);
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            dataOutputStream = dataOutputStream2;
                                            if (dataOutputStream == null) {
                                                f3.k.a(outputStream);
                                            } else {
                                                f3.k.a(dataOutputStream);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e9) {
                                    e = e9;
                                }
                            }
                        });
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e8) {
                        e = e8;
                        H2.p.e("Error transporting the ad response", e);
                        C2.v.s().x(e, "LargeParcelTeleporter.pipeData.2");
                        f3.k.a(autoCloseOutputStream);
                        this.f27351o = parcelFileDescriptor;
                        int a8 = AbstractC0814b.a(parcel);
                        AbstractC0814b.r(parcel, 2, this.f27351o, i8, false);
                        AbstractC0814b.b(parcel, a8);
                    }
                } catch (IOException e9) {
                    e = e9;
                    autoCloseOutputStream = null;
                }
                this.f27351o = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a82 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 2, this.f27351o, i8, false);
        AbstractC0814b.b(parcel, a82);
    }
}
