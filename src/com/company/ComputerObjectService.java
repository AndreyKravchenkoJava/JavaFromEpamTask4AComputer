package com.company;

import com.company.ComputerObject;
import com.company.Computer;
import com.company.ComputerObjectRepository;

public class ComputerObjectService {
    private ComputerObjectRepository computerObjectRepository;

    public ComputerObjectService(ComputerObjectRepository computerObjectRepository) {
        this.computerObjectRepository = computerObjectRepository;
    }

    public HardDrive getHardDrive() {
        return computerObjectRepository.getHardDrive();
    }
}
